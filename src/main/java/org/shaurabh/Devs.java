package org.shaurabh;

public class Devs {

    private Computer comp;


    public Devs() {
        System.out.println("Devs constructor");
    }
    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }


   public void build(){System.out.println( "Hello World working on a project" );
    comp.compile();}


}
