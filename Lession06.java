import java.util.ArrayList;

import javax.xml.transform.Result;

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
		int numbers;
		int n, i = 0;
	
		
		public MyNumber (int[] numbers) 
		{
			this. Numbers = Numbers;
		}
		
		public boolean kiemTraNguyenTo() 
		{
			boolean result = true;
			
			for ( int i =2 ; i<numbers; i++)
			{
				
				if (numbers % i == 0) 
				{
					result = false;
					break;
					
				}
			
			}
			
			return result;
			
		}
		
		public ArrayList xoaPhanTuTrung() 
		
		{
			ArrayList MyNumber = new ArrayList();
			ArrayList arrTemp = new ArrayList<>();
			
			boolean snt;
			snt = kiemTraNguyenTo();
			for ( i = 0; i < numbers; i ++) 
				
			{
				for (i = 0; i < MyNumber.size(); i++) 
				{
					//thêm các phần tử của MyNumber vào arrTemp
				    // nếu trong arrTemp đã tồn tại phần tử giống trong MyNumber
				    // thì không thêm vào, ngược lại thêm bình thường
					
						if (!arrTemp.contains(MyNumber.get(i))) 
						{
							arrTemp.add(MyNumber.get(i));
							
						}
					
				}
				MyNumber.clear();
			}
			MyNumber.addAll(arrTemp);
			return MyNumber;
			
		}
		
	}
	//GetTotal() - Trả ra tổng tất cả các giá trị số nguyên tố chẵn vừa tìm được.
			public ArrayList Get_Sochan() {
		
				ArrayList lstSochan = new ArrayList();
		
				for(int i=0; i< numbers.length; i++){
					if(i%2==0)
					{
				lstSochan.add(i);
					}
				}
		   
				return lstSochan;
			}
			
}
	


