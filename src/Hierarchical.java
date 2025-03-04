//grandparent
class Hierarchical {
     void Makesound() {
         System.out.println("Animals makes a Sound");
     }
}
//parent
class Cow extends Hierarchical {
    void moo() {
        System.out.println("Cow Moo's");
    }
}

//child
class Horse extends Cow {
    void neigh() {
        System.out.println("Horse Neighs");
    }
}
