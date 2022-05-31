public class Main
{
    public static void main (String args[]){
    Mother m = new Mother();
    m.show();
    Child ch = new Child();
    ch.show(); // the show function of Child class over rides the show function inherited from Mother and called Overriding function and Mother show is called Overridden function
    }
}
