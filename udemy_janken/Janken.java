public class Janken {
    
    public static void main(String[] args) {
    
        final String Hand_G = "グー";
        final String Hand_T = "チョキ";
        final String Hand_P = "パー";

        
        String player1 = args[0];
        String player2 = args[1];
        
        
        Player p1 = new Player(player1);
        Player p2 = new Player(player2);
            
    	System.out.println("じゃんけん。。。。ぽん！！！！");
    	
    	
    	p1.makeHandStatus();   
    	p2.makeHandStatus();
    	
    	System.out.println(p1.name + "さんの手：" + p1.handStatus);
        System.out.println(p2.name + "さんの手：" + p2.handStatus);

    	
    	System.out.println("結果は。。。。");
    	
    	
    	if((p1.handStatus).equals(p2.handStatus)) {
    		System.out.println("あいこ！　勝負つかず！");
    	}else if(
    		((p1.handStatus).equals(Hand_G) && (p2.handStatus).equals(Hand_T))
    		||((p1.handStatus).equals(Hand_T) && (p2.handStatus).equals(Hand_P))
    		||((p1.handStatus).equals(Hand_P) && (p2.handStatus).equals(Hand_G))
    	){
    		System.out.println(p1.name + "さんの勝利！！");
    	}else {
    	    System.out.println(p2.name + "さんの勝利！！");
    	}
    
    }
}