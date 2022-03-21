package com.ecommerce;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.Set;
import java.util.Map;


public class EProduct {
        private long ID;
        private String name;
        private BigDecimal price;
        private Date dateAdded;
        private List<Color> colors;
        private Set<Finance> finance;
        
        
        public EProduct() {
                
        }

		public long getID() {
			return ID;
		}

		public void setID(long iD) {
			ID = iD;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}

		public Date getDateAdded() {
			return dateAdded;
		}

		public void setDateAdded(Date dateAdded) {
			this.dateAdded = dateAdded;
		}

		public List<Color> getColors() {
			return colors;
		}

		public void setColors(List<Color> colors) {
			this.colors = colors;
		}

		public Set<Finance> getFinance() {
			return finance;
		}

		public void setFinance(Set<Finance> finance) {
			this.finance = finance;
		}

		
        
        
}
