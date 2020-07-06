package tips;


class Client{
	 private int id;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

	
}
public class EqualsRunner {

   
	public static void main(String[] args) {
   Client c1 = new Client();
   Client c2 = new Client(); 
   
   c1.equals(c2);
    
	}

}
