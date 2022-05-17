import java.util.*;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class DES{

public static void main(String[] args)
{
try{
Scanner sc= new Scanner(System.in);

String msg=sc.nextLine();
byte[] msgByte=msg.getBytes();

KeyGenerator kg= KeyGenerator.getInstance("DES");
SecretKey sk= kg.generateKey();

Cipher descipher= Cipher.getInstance("DES/ECB/PKCS5Padding");
descipher.init(Cipher.ENCRYPT_MODE, sk);
byte[] encryptedbyte=descipher.doFinal(msgByte);
descipher.init(Cipher.DECRYPT_MODE, sk);
byte[] decryptedbyte=descipher.doFinal(encryptedbyte);

System.out.println("Encrypted:"+ new String(encryptedbyte));
System.out.println("Encrypted:"+ new String(decryptedbyte));

}
catch(Exception e) {
    System.out.println(e.getMessage());
}

}


}
