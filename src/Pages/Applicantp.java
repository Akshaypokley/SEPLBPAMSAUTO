package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by akshay.pokley on 4/27/2018.
 */
public class Applicantp {
    WebDriver driver;

    @FindBy(xpath = ".//*[@id='Button3']")
    WebElement Proposalsubmisstion;

    @FindBy(xpath = ".//*[@id='AttachFile']/tbody/tr[3]/td/div/table/tbody/tr/td/div")
    WebElement Drawing_Data;

    @FindBy(xpath = ".//*[@id='btnSave']")
    WebElement Building_Submit;

    @FindBy(xpath = ".//*[@id='BuildingDetails']/tbody/tr[2]/td[2]/div/div[1]/table/tbody/tr[2]/td[5]")
    WebElement Building_Name;

    @FindBy(xpath = ".//*[@id='BuildingDetails']/tbody/tr[2]/td[2]/div/div[1]/table/tbody/tr[2]/td[6]")
    WebElement Building_Use;

    @FindBy(xpath = ".//*[@id='BuildingDetails']/tbody/tr[2]/td[2]/div/div[1]/table/tbody/tr[2]/td[7]")
    WebElement Building_Subuse;

    @FindBy(xpath = ".//*[@id='BuildingDetails']/tbody/tr[2]/td[2]/div/div[1]/table/tbody/tr[2]/td[8]")
    WebElement Building_Type;

    @FindBy(xpath = ".//*[@id='BuildingDetails']/tbody/tr[2]/td[2]/div/div[1]/table/tbody/tr[2]/td[9]")
    WebElement Building_driling_point;

    @FindBy(xpath = ".//*[@id='BuildingDetails']/tbody/tr[2]/td[2]/div/div[1]/table/tbody/tr[2]/td[10]")
    WebElement Building_Height;

    @FindBy(xpath = ".//*[@id='BuildingDetails']/tbody/tr[2]/td[2]/div/div[1]/table/tbody/tr[2]/td[11]")
    WebElement Building_Floors;

    @FindBy(xpath = ".//*[@id='liBuildingDetails']")
    WebElement Building_Details;

    @FindBy(xpath = ".//*[@id='cboDevelopmentArea']")
    WebElement Development_Area;
    @FindBy(xpath = ".//*[@id='cboLandUseZone']")
    WebElement Land_Use_Zone;
    @FindBy(xpath = ".//*[@id='cbolandsubuse']")
    WebElement Land_Sub_Use;
    @FindBy(xpath = ".//*[@id='cboPlotUse']")
    WebElement Plot_Use;
    @FindBy(xpath = ".//*[@id='cboPlotSubUse']")
    WebElement Plot_Sub_Use;


    @FindBy(xpath = ".//*[@id='txtOrigPlotArea']")
    WebElement Original_Plot_Area;
    @FindBy(xpath = ".//*[@id='txtFinalPlotArea']")
    WebElement Final_Plot_Area;
    @FindBy(xpath = ".//*[@id='txtAbbRoadwidth']")
    WebElement Abutting_Road_Width;
    @FindBy(xpath = ".//*[@id='txtpropRoadwidth']")
    WebElement Proposed_Road_Width;
    @FindBy(xpath = ".//*[@id='btSave']")
    WebElement SavePlot_Details ;


    @FindBy(xpath = ".//*[@id='liPlotDetails']")
    WebElement Plotdetails;

    @FindBy(xpath = ".//*[@id='liDocument']")
    WebElement Documentdetails;

    @FindBy(xpath = ".//*[@id='liDrawing']")
    WebElement Drawingdetails;

    @FindBy(xpath = ".//*[@id='liSiteInspection']")
    WebElement Sitevistdetails;

@FindBy(xpath = ".//*[@id='txtFlat']")
WebElement Address;

@FindBy(xpath = ".//*[@id='txtCity']")
WebElement City;

@FindBy(xpath = ".//*[@id='txtVillage']")
WebElement State;

@FindBy(xpath =".//*[@id='btnSave']")
WebElement save;
    @FindBy(xpath = ".//*[@id='TGEdit-0']/input")
    WebElement Sendtext;

    @FindBy(xpath = ".//*[@id='btnAdd']")
    WebElement AddBt;

    @FindBy(xpath = ".//*[@id='liProposal']/a")
    WebElement GenInfo;

    @FindBy(xpath = ".//*[@id='liapplication']/a")
    WebElement Applinfo;

    @FindBy(xpath = ".//*[@id='cboCaseType']")
    WebElement Case_Type;

    @FindBy(xpath = ".//*[@id='cboOffice']")
    WebElement Ward;

    @FindBy(xpath = ".//*[@id='cboGroupProjectType']")
    WebElement Project_Group_Type;

    @FindBy(xpath = ".//*[@id='cboProjectType']")
    WebElement Project_Type;

    @FindBy(xpath = ".//*[@id='cboSpclProject']")
    WebElement Special_Project;

    @FindBy(xpath = ".//*[@id='cboLocation']")
    WebElement Location;


    @FindBy(xpath = ".//*[@id='imgOrgHeader']")
    WebElement Applicationlogo;


    @FindBy(xpath = ".//*[@id='btnAction']")

    WebElement GeneateFn;

    @FindBy(xpath = ".//*[@id='btnApplyFor']")

    WebElement Applyfor;

    @FindBy(xpath = ".//*[@id='liBuildingPermission']/a")

    WebElement BP;

    public Applicantp(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        if(!Applicationlogo.isDisplayed())
            throw  new IllegalStateException("This is not login page");

    }
    public WebElement  getDrawing_Data()
    {
        return  Drawing_Data;
    }
public void clickPlotdetails()
{
    Plotdetails.click();
}
    public void setAddress(String address)
    {
        Address.sendKeys(address);
    }
    public void setCity(String city)
    {
City.sendKeys(city);
    }
    public void setState(String state)
    {
State.sendKeys(state);
    }
    public void clickSave()
    {
save.click();
    }
    public void setCase_Type(String case_type)
    {
        Select combo=new Select(Case_Type);
        combo.selectByVisibleText(case_type);
    }

    public void setWard(String ward)
    {
        Select combo=new Select(Ward);
        combo.selectByVisibleText(ward);
    }

    public void setProject_Group_Type(String project_group_type)
    {
        Select combo=new Select(Project_Group_Type);
        combo.selectByVisibleText(project_group_type);
    }


    public void setProject_Type(String project_type)
    {
        Select combo=new Select(Project_Type);
        combo.selectByVisibleText(project_type);
    }

    public void setSpecial_Project(String special_project)
    {
        Select combo=new Select(Special_Project);
        combo.selectByVisibleText(special_project);
    }

    public void setLocation(String location)
    {
        Select combo=new Select(Location);
        combo.selectByVisibleText(location);
    }



    public WebElement getApplicationlogo()
    {
        return  Applicationlogo;
    }



    public void clickApply()
    {
        Applyfor.click();
    }
    public void clickGeneateFn()
    {
        GeneateFn.click();
    }
    public void clickBP()
    {
        BP.click();
    }

    public WebElement getGenInfo()
    {
        return GenInfo;
    }


    public WebElement getApplinfo()
    {
        return Applinfo;
    }

    public void clickGenInfo()
    {
        GenInfo.click();
    }

    public void clickApplicInfo()
    {
        Applinfo.click();
    }

    public void clickAddBt()
    {
        AddBt.click();
    }

    public void clickProposalsubmisstion()
    {
        Proposalsubmisstion.click();
    }

public void setSendtext(String sendtext)
{
    Sendtext.sendKeys(sendtext);
}


    public void setDevelopment_Area(String development_area)
    {
        Select combo=new Select(Development_Area);
        combo.selectByVisibleText(development_area);
    }
    public void setLand_Use_Zone(String land_use_zone)
    {
        Select combo=new Select(Land_Use_Zone);
        combo.selectByVisibleText(land_use_zone);
    }

    public void setLand_Sub_Use(String land_sub_use)
    {
        Select combo=new Select(Land_Sub_Use);
        combo.selectByVisibleText(land_sub_use);
    }

    public void setPlot_Use(String plot_use)
    {
        Select combo=new Select(Plot_Use);
        combo.selectByVisibleText(plot_use);
    }
    public void setPlot_Sub_Use(String plot_sub_use)
    {
        Select combo=new Select(Plot_Sub_Use);
        combo.selectByVisibleText(plot_sub_use);
    }

    public void  setOriginal_Plot_Area(String original_plot_area)
    {
        Original_Plot_Area.sendKeys(original_plot_area);
    }

    public void  setFinal_Plot_Area(String final_plot_area)
    {
        Final_Plot_Area.sendKeys(final_plot_area);
    }
    public void  setAbutting_Road_Width(String abutting_road_width)
    {
        Abutting_Road_Width.sendKeys(abutting_road_width);
    }

    public void  setProposed_Road_Width(String proposedRoadWidth)
    {
        Proposed_Road_Width.sendKeys(proposedRoadWidth);
    }

    public void ClickPlotdetails()
    {
        Plotdetails.click();
    }

    public void clickDrawingdetails()
    {
        Drawingdetails.click();
    }

    public void clickSitevistdetails()
    {
        Sitevistdetails.click();
    }
    public void clickDocumentdetails()
    {
        Documentdetails.click();
    }

    public void ClickSavePlot_Details()
    {
        SavePlot_Details.click();
    }
    public void clickBuilding_Details()
    {
        Building_Details.click();
    }

    public WebElement getBuilding_Name()
    {
        return  Building_Name;
    }

    public WebElement getBuilding_Use()
    {
        return Building_Use;
    }
    public WebElement getBuilding_Type()
    {
        return Building_Type;
    }


    public WebElement getBuilding_Subuse()
    {
        return Building_Subuse;
    }

    public WebElement getBuilding_Height()
    {
        return Building_Height;
    }

    public WebElement getBuilding_Floors()
    {
        return Building_Floors;
    }
    public WebElement getBuilding_driling_point()
    {
        return Building_driling_point;
    }


    public void ClickBuilding_Submit()
    {
        Building_Submit.click();
    }
}
