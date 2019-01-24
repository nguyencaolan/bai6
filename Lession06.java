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
public class Lesson061 {
	public class MyNumber {
	    private int[] _numbers;

	    public MyNumber(int[] numbers) {
	        _numbers = numbers;
	    }

	    //- In ra những giá trị là số nguyên tố
	    public void getMyNumber() {
	        for (int i = 0; i < _numbers.length; i++) {
	            if (kiemtraNguyento(_numbers[i])) {
	                System.out.println(_numbers[i]);
	            }
	        }
	    }

	    //Trả ra tổng tất cả các giá trị số nguyên tố chẵn vừa tìm được.
	    public int getTotal() {
	        int total = 0;
	        for (int i = 0; i < _numbers.length; i++) {
	            if (kiemtraNguyento(_numbers[i]) && kiemtraSochan(_numbers[i])) {
	                total = total + _numbers[i];
	            }
	        }
			return total;
	    }

	    public boolean kiemtraNguyento(int n) {
	        if (n < 2)
	            return false;
	
	        for (int i = 2; i < Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public boolean kiemtraSochan(int n) {
	        return n % 2 == 0 ? true : false;
	    }
	}

}


