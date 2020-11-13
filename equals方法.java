class Card {
    public int rank;
    public String suit;
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    //重写equals方法
    public boolean equals(Object obj) {
        //引用同一个对象
        if(this == obj) {
            return true;
        }
        //obj是不是Card的实例
        //obj可以是Card的子类，也可以是Card本身
        if(obj == null || !(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        if(this.rank == card.rank && this.suit.equals(card.suit)) {
            return true;
        }
        return false;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Card card1 = new Card(1,"♥");
        Card card2 = new Card(1,"♥");
        System.out.println(card1.equals(card2));
    }
}