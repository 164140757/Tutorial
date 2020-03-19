public abstract class AbstractClass {
    protected String info;
    private String name;

    AbstractClass(String name){
        this.name = name;
        this.info = "tutorial";
    }
    public String getName(){
        return name;
    }
    public abstract String getID();
    public static void main(String[] args) {
        System.out.println("Hello,world!");
    }
}

class Test1 extends AbstractClass {
    private String ID;
    Test1(String name,String ID) {
        super(name);
        this.ID = ID;
    }

    @Override
    public String getID() {
        return ID;
    }

    public static void main(String[] args) {
        AbstractClass test1 = new Test1("Tom","123");
        System.out.println(test1.getName() + test1.getID()+test1.info);
    }
}

abstract class Test2_Abstract extends AbstractClass {

    Test2_Abstract(String name) {
        super(name);
    }
}
