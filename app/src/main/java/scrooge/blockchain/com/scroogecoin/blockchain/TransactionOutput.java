package scrooge.blockchain.com.scroogecoin.blockchain;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.security.PublicKey;

/**
 * Created by admin on 2018/3/30.
 */

class TransactionOutput {


    /**
     *  hash  that depends on
     *  1 transactionID
     *  2 recipient
     *  3 transaction amount
     *
     *  ------>  this is used as {@link NoobChain2#UTXOs}  key
     */
    public String id;  //

    public PublicKey reciepient; //also known as the new owner of these coins.
    public float value; //the amount of coins they own


    public String parentTransactionId; //the id of the transaction this output was created in

    //Constructor
    @RequiresApi(api = Build.VERSION_CODES.O)
    public TransactionOutput(PublicKey reciepient, float value, String parentTransactionId) {
        this.reciepient = reciepient;
        this.value = value;
        this.parentTransactionId = parentTransactionId;
        this.id = StringUtil.applySha256(StringUtil.getStringFromKey(reciepient)+Float.toString(value)+parentTransactionId);
    }

    //Check if coin belongs to you
    public boolean isMine(PublicKey publicKey) {
        return (publicKey == reciepient);
    }


}
