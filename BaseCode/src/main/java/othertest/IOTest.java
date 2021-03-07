package othertest;

import java.io.*;
import java.util.List;

public class IOTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File("D:/obj.txt")));
        User user = new User("zhao", "nan", 12);
        User user2 = new User("zha2o", "nan", 12);
        Person li = new Person("li", 12);
        outputStream.writeObject(user);
        outputStream.writeObject(user2);
        outputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("D:/obj.txt")));
        Object o = objectInputStream.readObject();
        System.out.println(o);
        objectInputStream.close();
    }
}
