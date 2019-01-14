import java.util.ArrayList;

/*
 * Tạo một class là MyNumber với các thuộc tính
 * int[] Numbers;
 * 
 * Phương thức
 * - MyNumber(int[] numbers) - Khởi tạo giá trị cho thuộc tính Numbers
 * - GetMyNumber() - Trả ra những giá trị là số nguyên tố và không bị trùng trong mảng Numbers
 * - GetTotal() - Trả ra tổng tất cả các giá trị số nguyên tố chẵn vừa tìm được.
 * - GetLuckyNumber() - Tìm xem có số nguyên tố nào trong mảng Numbers có giá trị bằng tổng 02 số nt liền trước không? 
 */
public class Lession06 {
	
	

	class MyNumber{
		
		public int[] Numbers;
		public int i;
		public int j;
		 
		// Method
		
		public MyNumber(int[] numbers)
		{
		this.Numbers = numbers;
		}
		
		public ArrayList<Integer> GetMyNumber(int number) 
		
		{
			ArrayList<Integer>arrOrderNumber = new ArrayList<Integer>();
			//boolean result = true;
			for (int i = 2; i < number; i++);
				
			if (number % i ==0) 
			{
				arrOrderNumber.add(i);	
					
				
			}
					
				return arrOrderNumber;
			
		}
		
		public ArrayList Get_Sole() {
			
			ArrayList arrSoLe = new ArrayList();

			for (int i = 0; i < number; i++) {   // chỗ này báo lỗi ở "number"
				if (i % 2 != 0) {
					arrSoLe.add(i);
				}
			}
			return arrSoLe;
		
		// GetMyNumber() - Trả ra những giá trị là số nguyên tố và không bị trùng trong mảng Numbers
		
		public ArrayList<Integer> RemoveDupplicateNumber()
		{
			ArrayList<Integer> arrMyNumber = new ArrayList<Integer>();
			for (int i = 0; i < this. Numbers.length; i++) 
			{
				boolean isDupplicate = false;
				int number = this.Numbers[i];
				for (int j = 0; j< this.Numbers.length;j++);
				{
					int checkNumber = this .Numbers[j];
					if (number == checkNumber && i!=j) 
					{
						isDupplicate = true;
						break;
					} 
					
				}
				if (isDupplicate == false) 
				{
					arrMyNumber.add(number);
				}
			}
			return arrMyNumber;
			
		}
		
		//Trả ra tổng tất cả các giá trị số nguyên tố chẵn vừa tìm được.
		
		public ArrayList GetTotal() {
			 
		
			
			return null;
			
		}
		
		
	}
}
		
	
	


