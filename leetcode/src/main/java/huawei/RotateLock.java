package huawei;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RotateLock {
    @Test
    public void main(){
        ArrayList<Integer> deadNum = new ArrayList<Integer>();
        deadNum.add(1111);
        deadNum.add(2222);
        deadNum.add(3333);
        Integer target=1231;

        Integer th=target/1000;
        Integer hu=target/100%10;
        Integer sh=target/10%10;
        Integer ge=target%10;

        Integer sum=th+hu+sh+ge;

        Set<Integer> set = new HashSet<Integer>();
        for(Integer a:deadNum){
            set.add(target/1000);
            set.add(target/100%10);
            set.add(target/10%10);
            set.add(target%10);
        }
    }
}
