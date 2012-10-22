public class Supermarket implements PersonQueue {
    private Person head = null;
    private Person tail = null;
    public void insert(Person person) {
        addPerson(person);
    }
   
     public void addPerson(Person person) {
         if (head == null) {
             head = person;
             tail = person;
         } else {
             person.prevPerson = head;
             person.prevPerson.nextPerson = person;
             head = person;
         }
        
    }
    public Person retrieve() {
        Person x=servePerson();
         if (x == null) {
         System.out.println("Queue is empty.");
         Person noResult = new Person("Null",21);
         return noResult;
         }
         else {
             return x;
         }
    }
         
    public Person servePerson() {
        if (tail == null) {
            return null;
        } else {
               Person temporary = tail;
               tail = tail.nextPerson;
               //tail.prevPerson = null;
               return temporary; 
        }
      
    }
   public static void main(String[] args) {
       Supermarket Morrisons = new Supermarket();
       Person person1 = new Person("Tom",21);
       Person person2 =  new Person ("Jim", 55);
       Person person3 =  new Person ("Carole", 80);
       Person person4 =  new Person ("Timothy", 12);
       Morrisons.insert(person1);
       Morrisons.insert(person2);
       Morrisons.insert(person3);
       Morrisons.insert(person4);
       System.out.println (Morrisons.retrieve().name);
       System.out.println (Morrisons.retrieve().name);
       System.out.println (Morrisons.retrieve().name);
       System.out.println (Morrisons.retrieve().name);
       
       
       
       
   }
}