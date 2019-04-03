package com.tmsps.XIRR;
/**
 * All rights Reserved, Designed By @72
 * @Title:  XIRRBean.java   
 * @Package com.tmsps.XIRR
 * @Description: 用于记录XIRR每一条的财务数据
 * @author: zhangwei
 * @date:   2019-04-02
 * @version V1.0
 * @Copyright: 2019 zhangwei All rights reserved. 
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目.
 */

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class XIRRBean {
	private BigDecimal amount;// 金额 如果金额为负值一般为投入本金，为正一般为分红或者赎回
	private LocalDate when;// 金额操作的时间，一般为YYYY-MM-DD格式

	public XIRRBean(String amount,String when) {
		this.amount = new BigDecimal(amount);
		this.when = LocalDate.parse(when);
	}
	
	public XIRRBean(String amount,LocalDate when) {
		this.amount = new BigDecimal(amount);
		this.when = when;
	}
	
	public XIRRBean(String amount,Date when) {
		this.amount = new BigDecimal(amount);
		this.when = LocalDate.from(when.toInstant().atZone(ZoneId.systemDefault()));
	}
	
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public LocalDate getWhen() {
		return when;
	}

	public void setWhen(LocalDate when) {
		this.when = when;
	}
}
