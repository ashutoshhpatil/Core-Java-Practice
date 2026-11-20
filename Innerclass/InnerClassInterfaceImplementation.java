package Innerclass;

interface Test{
    void display();
}

class OuterDemo {
    class InnerDemo implements Test{
        @Override
        public void display() {
            System.out.println("Implementation of interface in Inner Class");
        }
    }

    public static void main(String[] args) {
        OuterDemo obj = new OuterDemo();
        OuterDemo.InnerDemo innerObj = obj.new InnerDemo();

        innerObj.display();
    }
}
