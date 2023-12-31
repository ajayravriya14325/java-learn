//class Allien{

//  private final int id;
//  private final String name;
  
//  public Allien(int id, String name) {
//    this.id = id;
//    this.name = name;
//  }

//  public int getId() {
//    return id;
//  }

//  public String getName() {
//    return name;
//  }

//  @Override
//  public String toString() {
//    return "Allien [id=" + id + ", name=" + name + "]";
//  }

//  @Override
//  public int hashCode() {
//    final int prime = 31;
//    int result = 1;
//    result = prime * result + id;
//    result = prime * result + ((name == null) ? 0 : name.hashCode());
//    return result;
//  }

//  @Override
//  public boolean equals(Object obj) {
//    if (this == obj)
//      return true;
//    if (obj == null)
//      return false;
//    if (getClass() != obj.getClass())
//      return false;
//    Allien other = (Allien) obj;
//    if (id != other.id)
//      return false;
//    if (name == null) {
//      if (other.name != null)
//        return false;
//    } else if (!name.equals(other.name))
//      return false;
//    return true;
//  }
//}

//Can't extends with any other classes
record Allien(int id, String name) implements Cloneable{
//canonical constructor
  public Allien(int id, String name){
    if (id == 0) {
      throw new IllegalArgumentException("id can not be zero.");
    }else{
      this.id = id;
      this.name = name;
    }

  }
}

public class RecordClasses {
  public static void main(String[] args) {
    Allien a1 = new Allien(1, "Navin");
    Allien a2 = new Allien(1, "Navin");
    Allien a3 = new Allien(0,"");

    System.out.println(a1.equals(a2));
    System.out.println(a3);
  }
}
