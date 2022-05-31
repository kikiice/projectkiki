package practise.api.pojo;

import java.util.ArrayList;

public class Class3pojoMO {
	
		private int page;
		private int per_page;
		private int total;
		private int total_pages;
		private ArrayList<Class3pojodata> data;
	    private Class3pojoSupport support;
		public int getPage() {
			return page;
		}
		public int getPer_page() {
			return per_page;
		}
		public int getTotal() {
			return total;
		}
		public int getTotal_pages() {
			return total_pages;
		}
		public ArrayList<Class3pojodata> getData() {
			return data;
		}
		public Class3pojoSupport getSupport() {
			return support;
		}
		public void setPage(int page) {
			this.page = page;
		}
		public void setPer_page(int per_page) {
			this.per_page = per_page;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		public void setTotal_pages(int total_pages) {
			this.total_pages = total_pages;
		}
		public void setData(ArrayList<Class3pojodata> data) {
			this.data = data;
		}
		public void setSupport(Class3pojoSupport support) {
			this.support = support;
		}
	
	
	
	
	}


