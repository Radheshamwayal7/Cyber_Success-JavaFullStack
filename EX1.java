class EX1 {
    protected void show(){
        int i = 10;
    }
    
}

class EX2 extends  EX1{
    EX1 e = new EX1();
    e.show();
}
