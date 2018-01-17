package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票要素模型
 *
 * @author auto create
 * @since 1.0, 2017-09-20 15:54:16
 */
public class InvoiceElementModel extends AlipayObject {

	private static final long serialVersionUID = 6631753746342545115L;

	/**
	 * 发票报销状态
取值范围：
WAIT_EXPENSE－未报销
EXPENSE_PROCESSING－报销中
EXPENSE_FINISHED－已报销
	 */
	@ApiField("expense_status")
	private String expenseStatus;

	/**
	 * 发票是否有pdf文件
	 */
	@ApiField("has_pdf_file")
	private Boolean hasPdfFile;

	/**
	 * 该发票可能存在异常，请核实后使用
true:无异常
false:存在异常
	 */
	@ApiField("has_risk")
	private Boolean hasRisk;

	/**
	 * 发票金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票pdf文件转换后jpg预览地址
	 */
	@ApiField("invoice_img_url")
	private String invoiceImgUrl;

	/**
	 * 发票类型
可选值
PLAIN：增值税电子普通发票
SPECIAL：增值税专用发票
PLAIN_INVOICE:增值税普通发票
PAPER_INVOICE:增值税普通发票（卷式）
SALSE_INVOICE:机动车销售统一发票
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票状态　
取值范围
SUCCEED－正常蓝票
EXPIRED－已失效
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * 销方名称
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 销方税号
	 */
	@ApiField("payee_tax_no")
	private String payeeTaxNo;

	/**
	 * 购方名称
	 */
	@ApiField("payer_name")
	private String payerName;

	/**
	 * 购方税号
	 */
	@ApiField("payer_tax_no")
	private String payerTaxNo;

	public String getExpenseStatus() {
		return this.expenseStatus;
	}
	public void setExpenseStatus(String expenseStatus) {
		this.expenseStatus = expenseStatus;
	}

	public Boolean getHasPdfFile() {
		return this.hasPdfFile;
	}
	public void setHasPdfFile(Boolean hasPdfFile) {
		this.hasPdfFile = hasPdfFile;
	}

	public Boolean getHasRisk() {
		return this.hasRisk;
	}
	public void setHasRisk(Boolean hasRisk) {
		this.hasRisk = hasRisk;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceImgUrl() {
		return this.invoiceImgUrl;
	}
	public void setInvoiceImgUrl(String invoiceImgUrl) {
		this.invoiceImgUrl = invoiceImgUrl;
	}

	public String getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeeTaxNo() {
		return this.payeeTaxNo;
	}
	public void setPayeeTaxNo(String payeeTaxNo) {
		this.payeeTaxNo = payeeTaxNo;
	}

	public String getPayerName() {
		return this.payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getPayerTaxNo() {
		return this.payerTaxNo;
	}
	public void setPayerTaxNo(String payerTaxNo) {
		this.payerTaxNo = payerTaxNo;
	}

}
