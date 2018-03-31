package scrooge.blockchain.com.scroogecoin;

import org.junit.Test;

import java.security.Security;

import scrooge.blockchain.com.scroogecoin.blockchain.Block;
import scrooge.blockchain.com.scroogecoin.blockchain.NoobChain;
import scrooge.blockchain.com.scroogecoin.blockchain.NoobChain2;
import scrooge.blockchain.com.scroogecoin.blockchain.Wallet;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TestChain {


    @Test
    public void test1() {

//        Block genesisBlock = new Block("Hi im the first block", "0");
//        System.out.println("Hash for block 1 : " + genesisBlock.hash);
//
//        Block secondBlock = new Block("Yo im the second block",genesisBlock.hash);
//        System.out.println("Hash for block 2 : " + secondBlock.hash);
//
//        Block thirdBlock = new Block("Hey im the third block",secondBlock.hash);
//        System.out.println("Hash for block 3 : " + thirdBlock.hash);


    }


    @Test
    public void test2() {
        NoobChain.testChain();

    }


    @Test
    public void test3() {
        NoobChain2.testChain();
    }




}