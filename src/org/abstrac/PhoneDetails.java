package org.abstrac;

public class PhoneDetails {
	public void phoneInfo() {
		System.out.println("Method 1 : abc");
	}
		public void phoneInfo(char b) {
			System.out.println("Method 2 : efg");
		}
			public void phoneInfo(String a,String b) {
				System.out.println("Method 3 :  lmn");
			}
				public void phoneInfo(int q, String c) {
					System.out.println("Method 4 : xyz");
				}
				public static void main(String[] args) {
					PhoneDetails ph = new PhoneDetails();
					ph.phoneInfo(5, "abc");
					ph.phoneInfo('a');
				}
	}

