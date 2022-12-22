import java.lang.Thread;
public class SG_RandomWalk {
    public static void main(String[]args){
        /*Rectangle box = new Rectangle(150, 150, 150, 150);
        box.draw();
        Ellipse egg = new Ellipse(100, 100, 40, 60);
        egg.setColor(Color.YELLOW);
        egg.fill(); */  

        
        int count = 0;
        Rectangle background = new Rectangle(0,0,300,300);
        background.setColor(Color.BLUE);
        background.draw();
        Ellipse circle = new Ellipse(50,50,200,200);
        circle.draw();
        Ellipse player = new Ellipse(145,145,10,10);
        player.setColor(Color.RED);
        player.draw();
        player.fill();
        int px = player.getX();
        int py = player.getY();
        while (!(Math.pow(px-150,2) + Math.pow(py-150,2) > 10000)){
            int tx = (int)(Math.random()*21-10);
            int ty = (int)(Math.random()*21-10);
            player.translate(tx,ty);
            px = player.getX();
            py = player.getY();
            count++;
            try { Thread.sleep(100);}
            catch(Exception ex) {};


        }
        System.out.println(count);
        
        
    }
}
