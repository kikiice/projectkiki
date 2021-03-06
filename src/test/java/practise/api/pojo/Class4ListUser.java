package practise.api.pojo;

import java.util.ArrayList;

public class Class4ListUser {
	 private int page;
	 private int per_page;
	 private int total;
	 private int total_pages;
	 private ArrayList<Class4data> data;
	 public Class4ListUser(int page, int per_page, int total, int total_pages, ArrayList<Class4data> data,
			Class4support support) {
		super();
		this.page = page;
		this.per_page = per_page;
		this.total = total;
		this.total_pages = total_pages;
		this.data = data;
		this.support = support;
	}
	private Class4support support;
	
		public int getPage() {
			return page;
		}
		public void setPage(int page) {
			this.page = page;
		}
		public int getPer_page() {
			return per_page;
		}
		public void setPer_page(int per_page) {
			this.per_page = per_page;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		public int getTotal_pages() {
			return total_pages;
		}
		public void setTotal_pages(int total_pages) {
			this.total_pages = total_pages;
		}
		public ArrayList<Class4data> getData() {
			return data;
		}
		public void setData(ArrayList<Class4data> data) {
			this.data = data;
		}
		public Class4support getSupport() {
			return support;
		}
		public void setSupport(Class4support support) {
			this.support = support;
		}

}
