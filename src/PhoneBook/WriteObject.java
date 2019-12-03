package PhoneBook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] phoneListIn = {new Person(1, "89537391800"),
                new Person(2, "89537391801"), new Person(3, "89537391899")};

        ReadObject readObject = new ReadObject();
        readObject.read();

        for(int i = 0; i<phoneListIn.length; i++){
            String newNum = phoneListIn[i].getName();
            for(int n = 0; n<readObject.people.length; n++){
                String exNum = readObject.people[n].getName();{
                    if (newNum.equals(exNum)){
                        System.out.println("nonUniquePhoneNumberException");
                    }else;
                }
            }
        }

        try {
            FileOutputStream fos = new FileOutputStream("people.bin", false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);


            oos.writeObject(phoneListIn);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
