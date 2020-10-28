package Pontoon_V3_Inheritance;

public class Card

{

        private Suits suit;
        private values numberValue;



        public Card (values cardValue, Suits suit)
        {
            this.numberValue = cardValue;
            this.suit = suit;
        }



        public Suits getSuit()
        {

            return suit;
        }



        public void setSuit(Suits suit)
        {
            this.suit = suit;
        }



        public values getCardValue()
        {
            return numberValue;
        }



        public void setCardValue(values numberValue)
        {
            this.numberValue = numberValue;
        }

}





