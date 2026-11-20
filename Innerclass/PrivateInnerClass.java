package Innerclass;

class OuterDemo1{
    private int number = 100;

      private class InnerClass {
          void dispInfo(){
              System.out.println(number);
          }
      }

    public static void main(String[] args) {
        OuterDemo1 obj = new OuterDemo1();
        OuterDemo1.InnerClass obj2 = obj.new InnerClass();

        new OuterDemo1().new InnerClass().dispInfo();
        obj2.dispInfo();
    }
}
