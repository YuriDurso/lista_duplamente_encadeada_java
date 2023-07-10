package listade;

public class ListaDE <T> {
    
   public Item head = null;
   public Item tail = null;

   public boolean ListaDEVazio(){
     if (head == null && tail == null)
        return true;
     else
        return false;
   }

   public void adicionarInicio(T novo){
Item a = new Item();
a.item = novo;
     if(ListaDEVazio()){
        a.itemPosterior = a;
        a.itemAnterior = a;
        head = a;
     } else{
          a.itemPosterior = head;
     a.itemAnterior = tail;
     head = a;
     }

    
   }

   public void adicionarFinal(Item novo){

     if(ListaDEVazio()){
        head = novo;
        tail = novo;
     }

     novo.itemPosterior = head;
     novo.itemAnterior = tail;
     tail = novo;
     novo.itemPosterior.itemAnterior = novo;
     novo.itemAnterior.itemPosterior = novo;
   }
    
    
   public void imprimir() {
       Item aux = head;
       
       do {
           System.out.println("item: " + aux.item);
           if(aux.itemAnterior != null)
               System.out.println("Anterior: " + aux.itemAnterior.item);
           if(aux.itemPosterior != null)
               System.out.println("Posterior: " + aux.itemPosterior.item);
           System.out.println("------------------------------------");
           aux = aux.itemPosterior;
       }while(aux != head);
       
   }
   public class Item{
    T item;
    Item itemAnterior;
    Item itemPosterior;

    public Item (){
        itemAnterior = null;
        itemPosterior = null;
    }
}
}

    

