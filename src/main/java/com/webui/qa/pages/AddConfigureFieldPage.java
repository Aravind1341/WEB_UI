package com.webui.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.webui.qa.base.TestBase;

public class AddConfigureFieldPage extends TestBase  {

	@FindBy(className = "feedbackPanel")
    WebElement feedBackPanel;
	
	@FindBy(xpath="//img[@alt='Save Current Record']")
	 WebElement saveButton;
	
	//General
	
	@FindBy(xpath="//a[@href='#wuiConfFieldTab1']")
	WebElement generalTab; 
	
	@FindBy(id="modIdDropDown61")
	WebElement moduleID; 
	
	@FindBy(id="fieldId63")
	WebElement fieldID; 
	
	@FindBy(id="disabledFlagDropDown66")
	WebElement disableFlag; 
	
	@FindBy(id="dbColumnName68")
	WebElement databaseColumnName; 
	
	@FindBy(id="dbColDataTypeDropDown6b")
	WebElement databaseColumnDataType; 
	
	@FindBy(id="operations6d")
	WebElement operations; 
	
	@FindBy(id="searchCompFlagDropDown70")
	WebElement searchCompulsory; 
	
	@FindBy(id="searchDefFlagDropDown73")
	WebElement searchDefault; 
	
	@FindBy(id="fieldGrpIdDropDown76")
	WebElement fieldGroupID; 
	
	@FindBy(id="fieldSeq78")
	WebElement fieldSequence; 
	
	@FindBy(id="fieldTypeDropDown7b")
	WebElement fieldType; 
	
	@FindBy(id="fieldWOlabelFlagDropDown7e")
	WebElement fieldWithoutLabel; 
	
	@FindBy(id="fieldWidth80")
	WebElement fieldWidth; 
	
	@FindBy(id="defValue84")
	WebElement defultValue; 
	
	
	//INPUTS
	
	@FindBy(xpath="//a[@href='#wuiConfFieldTab2']")
	WebElement InputsTab; 
	
	@FindBy(id="keyFlagDropDown88")
	WebElement keyField; 
	
	@FindBy(id="keySeq8a")
	WebElement keySequence; 
	
	@FindBy(id="compulsoryFlagDropDown8d")
	WebElement compulsory;
	
	@FindBy(id="inpDataTypeDropDown90")
	WebElement inputDataType;
	
	
	@FindBy(id="inpDataLength92")
	WebElement inputDataLength;
	
	
	@FindBy(id="inpDataFormat94")
	WebElement inputDataFormat;
	
	
	@FindBy(id="inpValClassDropDown97")
	WebElement inputValidationClass;
	
	@FindBy(id="inpValParamsDropDown9a")
	WebElement inputValidationParameters;
	
	
	//Selection TAB
	
		@FindBy(xpath = "//a[@href='#wuiConfFieldTab3']")
		@CacheLookup
		WebElement Tab_Selection;
		
		@FindBy(name = "wuiConfFieldTab3:selSourceTypeDropDown")
		@CacheLookup
		WebElement SelSourceType;
		
		@FindBy(name = "wuiConfFieldTab3:selCommonListName")
		@CacheLookup
		WebElement SelCommonListName;
		
		@FindBy(name = "wuiConfFieldTab3:selMatchTypeName")
		@CacheLookup
		WebElement SelMatchTypeListName;
		
		@FindBy(name = "wuiConfFieldTab3:selMatchTypeRefFldId")
		@CacheLookup
		WebElement SelMatchTypeRefID;
		
		@FindBy(name = "wuiConfFieldTab3:selRefTableName")
		@CacheLookup
		WebElement SelRefTableName;
		
		@FindBy(name = "wuiConfFieldTab3:selRefTableLocateMode")
		@CacheLookup
		WebElement SelRefTableLocateMode;
		
		@FindBy(name = "wuiConfFieldTab3:selRefTableLocateParam")
		@CacheLookup
		WebElement SelRefTableLocateParam;
		
		@FindBy(name = "wuiConfFieldTab3:selRefTableValColName")
		@CacheLookup
		WebElement SelRefTableValColName;
		
		@FindBy(name = "wuiConfFieldTab3:selRefTableDescColName")
		@CacheLookup
		WebElement SelRefTableDescColName;
		
		@FindBy(name = "wuiConfFieldTab3:selRefTableAddFilter")
		@CacheLookup
		WebElement SelRefTableAddFilter;
		
		@FindBy(name = "wuiConfFieldTab3:selRefTableRefCriteria")
		@CacheLookup
		WebElement SelRefTableRefCriteria;
		
		@FindBy(name = "wuiConfFieldTab3:selRefTableRefFields")
		@CacheLookup
		WebElement SelRefTableRefFields;
		
		
		//Derivation TAB
		
		@FindBy(xpath = "//a[@href='#wuiConfFieldTab4']")
		@CacheLookup
		WebElement Tab_Derivation;
		
		@FindBy(name = "wuiConfFieldTab4:deriveRefFields")
		@CacheLookup
		WebElement DerRefField;
		
		@FindBy(name = "wuiConfFieldTab4:deriveMethod")
		@CacheLookup
		WebElement DerMethod;
		
		@FindBy(name = "wuiConfFieldTab4:deriveCustomClass")
		@CacheLookup
		WebElement DerCustClass;
		
		@FindBy(name = "wuiConfFieldTab4:deriveParams")
		@CacheLookup
		WebElement DerParams;
		
		@FindBy(name = "wuiConfFieldTab4:dbColumnDataFormat")
		@CacheLookup
		WebElement DBColDataFormat;
		
		@FindBy(name = "wuiConfFieldTab4:fieldTypeProps")
		@CacheLookup
		WebElement FieldTypeProp;
		
		@FindBy(name = "wuiConfFieldTab4:fieldTypeParams")
		@CacheLookup
		WebElement FieldTypeParams;
		
	//Initializing the page objects
	public AddConfigureFieldPage() {
		PageFactory.initElements(driver, this);
	}
	
//	public void ClickGeneralTab() {
//		generalTab.click();
//	}
	

	public void enterGeneralDetails(String ModuleID,String FieldID,String DisabledFlag,String DatabaseColumnName,String DatabaseColumnDataType,
			String Operations,String SearchCompulsory,String SearchDefault,String FieldGroupID,String FieldSequence, String FieldType,
			String FieldWithoutLabel,String FieldWidth,String DefaultValue) {
		
		selectDropDownUsingVisibleText(moduleID, ModuleID);
		fieldID.sendKeys(FieldID);
		selectDropDownUsingVisibleText(disableFlag, DisabledFlag);
		databaseColumnName.sendKeys(DatabaseColumnName);
		selectDropDownUsingVisibleText(databaseColumnDataType, DatabaseColumnDataType);
		operations.sendKeys(Operations);
		selectDropDownUsingVisibleText(searchCompulsory, SearchCompulsory);
		selectDropDownUsingVisibleText(searchDefault, SearchDefault);
		selectDropDownUsingVisibleText(fieldGroupID, FieldGroupID);
		fieldSequence.sendKeys(FieldSequence);
		selectDropDownUsingVisibleText(fieldType, FieldType);
		selectDropDownUsingVisibleText(fieldWithoutLabel, FieldWithoutLabel);
		fieldWidth.sendKeys(FieldWidth);
		defultValue.sendKeys(DefaultValue);
	}
	
	
	public void ClickInputsTab() {
		InputsTab.click();
	}

	public void enterInputsDetails(String KeyField,String KeySequence,String Compulsory, String InputDataType,
			String InputDataLength,String InputDataFormat,String InputValidationClass,String InputValidationParameters ) {
		
		selectDropDownUsingVisibleText(keyField, KeyField);
		keySequence.sendKeys(KeySequence);
		selectDropDownUsingVisibleText(compulsory, Compulsory);
		selectDropDownUsingVisibleText(inputDataType, InputDataType);
		inputDataLength.sendKeys(InputDataLength);
		inputDataFormat.sendKeys(InputDataFormat);
		selectDropDownUsingVisibleText(inputValidationClass, InputValidationClass);
		selectDropDownUsingVisibleText(inputValidationParameters, InputValidationParameters);
		
	}
	
	
	public void ClickSelectiontab() {
		Tab_Selection.click();
	}
	
	
	public void enterSelectionDetails(String SelSourcetype,String SelCommonListname,String SelMatchTypeListname,
			String SelMatchTypeRefId,String SelRefTablename,String SelRefTableLocatemode,String SelRefTableLocateparam,
			String SelRefTableValColname,String SelRefTableDescColname,String SelRefTableaddFilter,
			String SelRefTableRefcriteria,String SelRefTableReffields) {
		selectDropDownUsingVisibleText(SelSourceType, SelSourcetype);
		SelCommonListName.sendKeys(SelCommonListname);
		SelMatchTypeListName.sendKeys(SelMatchTypeListname);
		SelMatchTypeRefID.sendKeys(SelMatchTypeRefId);
		SelRefTableName.sendKeys(SelRefTablename);
		SelRefTableLocateMode.sendKeys(SelRefTableLocatemode);
		SelRefTableLocateParam.sendKeys(SelRefTableLocateparam);
		SelRefTableValColName.sendKeys(SelRefTableValColname);
		SelRefTableDescColName.sendKeys(SelRefTableDescColname);
		SelRefTableAddFilter.sendKeys(SelRefTableaddFilter);
		SelRefTableRefCriteria.sendKeys(SelRefTableRefcriteria);
		SelRefTableRefFields.sendKeys(SelRefTableReffields);

	}
	
	
	public void ClickDerivationtab() {
		Tab_Derivation.click();
	}
	
	public void enterDerivaitonDetails(String DerReffields,String Derivemethod,String DerCustclass,
			String Derparams,String DBColDataformat,String FieldtypeProp,String FieldtypeParams) {
		DerRefField.sendKeys(DerReffields);
		DerMethod.sendKeys(Derivemethod);
		DerCustClass.sendKeys(DerCustclass);
		DerParams.sendKeys(Derparams);
		DBColDataFormat.sendKeys(DBColDataformat);
		FieldTypeProp.sendKeys(FieldtypeProp);
		FieldTypeParams.sendKeys(FieldtypeParams);
	}
	
	public String validateFeedbackPanel() {
        return feedBackPanel.getText();
    }
	
	public void ClickSave() {
		saveButton.click();
	}
	
	
}
