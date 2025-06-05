public class Arrays {
    public static void main(String[] args) {
        int [] myArr = new int[5];
        myArr[0] = 98;
        myArr[1] = 96;
        myArr[2] = 65;
        myArr[3] = 91;
        myArr[4] = 97;
        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);
        System.out.println();
        int index = 0;
        while (index < myArr.length)
        {
            System.out.println(myArr[index]);
            index++;
        }
    }
}
