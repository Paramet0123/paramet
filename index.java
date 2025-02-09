import java.util.Scanner;
public class ChaEr {
    public static void main(String[] args) {
        // \n => ขึ้นบรรทัดใหม่
        // \t => tab
    System.out.println("1 Hello \t world");
    System.out.println("2 Hello \n world");
    //Oprrator ดำเนินการ 
    //A+B operator การ + ของ A กับ B
    //AกับB operand
    //+ - * / | 
		//	% คือหารเอาเศษ
    Scanner s=new Scanner(System.in);
    System.out.println("ป้อนค่า = ");
    int a=sc.nextInt();
    System.out.println("ป้อนค่า  = ");
    int b=sc.nextInt();
		
    System.out.println("ผลบวก a b = "+(a+b));//ห้ามนำ +a+b เพราะว่าจะเป็นการต่่อคำ 1514
    System.out.println("ผลลบ a b = "+(a-b));
    System.out.println("ผลคูณ a b = "+(a*b));
    System.out.println("ผลหาร a b = "+(a/b));
    System.out.println("ผลหารเอาเศษ a b = "+(a%b));
    System.out.println("ผลบวก a b = "+(a-b)); //+a-b แบบนี้ก็ไม่ได้ error
    //ตัวดำเนินการเปรียบเทียบ
    //ชนิดข้อมูล boolean true / false 
    int z=10,x=4; //นำตัวเปรียบเทียบ มาเก็บ
     //สร้าง ตัวเก็บการ เปรียบเทียบ และสามารถนำค่านี้ไป ใช้งานกับอื่นๆได้ด้วย
    boolean c=(z==x);   // เท่ากับ
    boolean c1=(z!=x);  // ไม่ะเท่ากัน
    boolean c2=(z>x);   // มากกว่า
    boolean c3=(z<x);   // น้อบกว่า
    boolean c4=(z>=x);   // มากกว่าหรือ เท่ากับ  
    boolean c5=(z<=x);   // น้อยกว่าหรือ เท่ากัน
    System.out.println(c); // แสดงค่า 
    System.out.println(z==x); // เปรียบเทียบในที่แสดงค่า ก็ได้
    System.out.println(","+z+", มีค่าเท่ากัน ,"+x+ ", หรือไม่ ?  ,"+c); //การนำข้อความมาช่วย แสดงค่าด้วยในการเปรียนเทียบ
    // ตัวดำเนินการทางตรรกศาสตรื 
    // เป็นการเชื่อมเงื่อนไง ตั้งแต่ 2 ตัวขึ้นไป และนำตัวดำเนินการเปรียบเทียบ มาใช้งานด้วยเพื่อแสดงเป็น true/false 
    // &&   | and และ มี falseตัวเดียว = falseเลย
    // ||   | or หรือ  มี ture ตัวเดียว = trueเลย
    // !    | not ไม่  เป้น การสลับจาก เท็จเป็นจริงจริงเป็นเท็จ
    int a_=10,b_=29;
        boolean c_=(a_==b_);
        boolean c_1=(a_<b_);
        System.out.println(c_1&&c_); // false and
        System.out.println(c_1||c_); //true or 
        System.out.println(!(a_==b_)); //true not สลับ
    // ตัวดำเนินการ (เพิ่มค่า - ลดค่า)
    /* 
    ++a การเพิ่ม prefix คือการ เพิ่มค่าจาก 1 เป็น 2 กำหนดค่าแล้วที่งานเลยย
    a++ การเพิ่ม postfix คือการ เพิ่มค่านำค่ามาเก็บแล้วเพิ่มจาก 1 เป็น 2   ใช้งานค่าเดิมก่อนค่อยใช้งาน

    --a การเพิ่ม prefix คือการ ลดค่าจาก 1 เป็น 2 กำหนดค่าแล้วที่งานเลยย
    a-- การเพิ่ม postfix คือการ ลดค่านำค่ามาเก็บแล้วลดจาก 1 เป็น -1   ใช้งานค่าเดิมก่อนค่อยใช้งาน 

    #ตัวอย่างๆ วิธีการรัน คือ นำ__ ออก แล้วก็หลังจากรัน + แล้วรัน - ด้วย*/ 
    int a__=14;
    System.out.println(a);
    System.out.println(++a);
    System.out.println(a);
    
    a__=5;
    System.out.println(a);
    System.out.println(a++);
    System.out.println(a);
    //ลดรูป// การ Compound Assignment หรือ เขียนแบบการคำนวณเก็บค่าแล้วนำไปใช้ต่อ วิธีการรัน คือ นำ __ ออก
    int x__=10,z__=20;
    x+=z;
    System.out.println(x);
    x-=z;
    System.out.println(x);
    x*=z;
    System.out.println(x);
    x/=z;
    System.out.println(x);
    x%=z;
    System.out.println(x);
    //ความสำคัญ
    /*  ความเท่ากัน   ลำดับการทำงาน
    1 ()                ซ้ายไปขวา
    2 ++ ,--            ซ้ายไปขวา   
    3 *, /, %           ซ้ายไปขวา
    4 +,-               ซ้ายไปขวา
    5 < ,<= , > >=      ซ้ายไปขวา
    6 ==,!=             ซ้ายไปขวา
    7  &&               ซ้ายไปขวา
    8  ||               ซ้ายไปขวา
    9  = ,+= ,-= ,*= ,/=,&= -ขาวไปซ้าย
     */
    }
    
}
