package jianzhioffer;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
 *  则经过替换之后的字符串为We%20Are%20Happy。
 */

/**
 * way1：用java自带的 repalceall
 *
 * way2:临时数组一个字符一个字符放入
 *
 * way3:split 以空格split字符串 间隔添加%20 结尾增加空格 保证结尾也可用
 */


public class Offer02 {

    public static void main(String[] args) {
//        API法
//        String stringA="We Are Happy";
//        String s = stringA.replaceAll(" ", "%20");
//        System.out.println(s);
        String stringA="We Are Happy";
        String[] s = stringA.split(" ");
//        System.out.println("+++"+s[0]+s[1]+s[2]+"end");
        StringBuffer newString = new StringBuffer();

        char[] chars = stringA.toCharArray();
        for(char a:chars){
            if(a!=' '){
                newString.append(a);
            }else {
                newString.append("%20");
            }
        }
        System.out.println(newString);

    }
}
