package lab3;

public class CR extends Human implements Say,Wait,Walking {
    CR(String name, int age, Sex sex){
        super(name,age,sex);
    }

    CR(){
        super();
    }

    String destname;

    public void setDestname(String n) {
        this.destname=n;
    }

    @Override
    public Void say(String words) {
        System.out.print(this.name+" says:"+words);
        return null;
    }

    @Override
    public Void waiting() {
        System.out.printf("%s is waiting\n",this.name);
        return null;
    }

    @Override
    public Void walk(String nameofdes) {
        System.out.printf("%s is walking to %s\n",this.name,nameofdes);
        return null;
    }



    public void detailmove(){
        if(getStatus()==Status.WAITING){
            waiting();
        }else if(getStatus()==Status.WALKING&&destname!=null){
            walk(destname);
        }else if(getStatus()==Status.STANDINGBYRIVER){
            System.out.print(this.name+" looked around the environment\n");
        }
    }
}
