package scrooge.blockchain.com.scroogecoin.blockchain;

/**
 * Created by admin on 2018/3/30.
 *
 *
 * transaction output was created showing that X Bitcoin was sent to your address.
 *
 * Transaction inputs are references to previous transaction outputs.
 *
 *
 * This class will be used to reference UTXO.
 * The transactionOutputId will be used to find the relevant TransactionOutput, allowing miners to check your ownership.
 *
 *
 * you can only pay if you have UTXO !!! which is unspent output from other transactions
 *
 */

class TransactionInput {

    /**
     *  {@link TransactionOutput#id}
     */
    public String transactionOutputId; //Reference to TransactionOutputs -> transactionId

    public TransactionOutput UTXO; //Contains the Unspent transaction output

    public TransactionInput(String transactionOutputId) {
        this.transactionOutputId = transactionOutputId;
    }

}
