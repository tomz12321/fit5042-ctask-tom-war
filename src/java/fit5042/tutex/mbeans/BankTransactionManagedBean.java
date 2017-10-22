/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.mbeans;

import fit5042.tutex.repository.TransactionRepository;
import fit5042.tutex.repository.entities.BankTransaction;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tomz123
 */
@ManagedBean(name = "transactionManagedBean")
@SessionScoped
public class BankTransactionManagedBean implements Serializable {

    @EJB
    TransactionRepository transactionRepository;

    /**
     * Creates a new instance of PropertyManagedBean
     */
    public BankTransactionManagedBean() {
    }

    public List<BankTransaction> getAllBankTransactions() {
        try {
            return transactionRepository.getAllBankTransactions();
        } catch (Exception ex) {
            Logger.getLogger(BankTransactionManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
