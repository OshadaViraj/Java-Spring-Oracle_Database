/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testspring.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Oshada
 */
@Entity
@Table(name = "HOTELS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hotels.findAll", query = "SELECT h FROM Hotels h")
    , @NamedQuery(name = "Hotels.findByManagingCompanySeq", query = "SELECT h FROM Hotels h WHERE h.managingCompanySeq = :managingCompanySeq")
    , @NamedQuery(name = "Hotels.findByCode", query = "SELECT h FROM Hotels h WHERE h.code = :code")
    , @NamedQuery(name = "Hotels.findByShortName", query = "SELECT h FROM Hotels h WHERE h.shortName = :shortName")
    , @NamedQuery(name = "Hotels.findByLongName", query = "SELECT h FROM Hotels h WHERE h.longName = :longName")
    , @NamedQuery(name = "Hotels.findByLocation", query = "SELECT h FROM Hotels h WHERE h.location = :location")
    , @NamedQuery(name = "Hotels.findByAddress1", query = "SELECT h FROM Hotels h WHERE h.address1 = :address1")
    , @NamedQuery(name = "Hotels.findByAddress2", query = "SELECT h FROM Hotels h WHERE h.address2 = :address2")
    , @NamedQuery(name = "Hotels.findByAddress3", query = "SELECT h FROM Hotels h WHERE h.address3 = :address3")
    , @NamedQuery(name = "Hotels.findByWebSite", query = "SELECT h FROM Hotels h WHERE h.webSite = :webSite")
    , @NamedQuery(name = "Hotels.findByEmail", query = "SELECT h FROM Hotels h WHERE h.email = :email")
    , @NamedQuery(name = "Hotels.findByHotelFax1", query = "SELECT h FROM Hotels h WHERE h.hotelFax1 = :hotelFax1")
    , @NamedQuery(name = "Hotels.findByHotelFax2", query = "SELECT h FROM Hotels h WHERE h.hotelFax2 = :hotelFax2")
    , @NamedQuery(name = "Hotels.findByHotelPhone1", query = "SELECT h FROM Hotels h WHERE h.hotelPhone1 = :hotelPhone1")
    , @NamedQuery(name = "Hotels.findByHotelPhone2", query = "SELECT h FROM Hotels h WHERE h.hotelPhone2 = :hotelPhone2")
    , @NamedQuery(name = "Hotels.findByTbClassification", query = "SELECT h FROM Hotels h WHERE h.tbClassification = :tbClassification")
    , @NamedQuery(name = "Hotels.findByPropertyCode", query = "SELECT h FROM Hotels h WHERE h.propertyCode = :propertyCode")
    , @NamedQuery(name = "Hotels.findByEncashFc", query = "SELECT h FROM Hotels h WHERE h.encashFc = :encashFc")
    , @NamedQuery(name = "Hotels.findByAccCreditCard", query = "SELECT h FROM Hotels h WHERE h.accCreditCard = :accCreditCard")
    , @NamedQuery(name = "Hotels.findByShopArc", query = "SELECT h FROM Hotels h WHERE h.shopArc = :shopArc")
    , @NamedQuery(name = "Hotels.findByParking", query = "SELECT h FROM Hotels h WHERE h.parking = :parking")
    , @NamedQuery(name = "Hotels.findByRrLib", query = "SELECT h FROM Hotels h WHERE h.rrLib = :rrLib")
    , @NamedQuery(name = "Hotels.findByHealthCentre", query = "SELECT h FROM Hotels h WHERE h.healthCentre = :healthCentre")
    , @NamedQuery(name = "Hotels.findByDoctor", query = "SELECT h FROM Hotels h WHERE h.doctor = :doctor")
    , @NamedQuery(name = "Hotels.findByConfFac", query = "SELECT h FROM Hotels h WHERE h.confFac = :confFac")
    , @NamedQuery(name = "Hotels.findByGuideAccom", query = "SELECT h FROM Hotels h WHERE h.guideAccom = :guideAccom")
    , @NamedQuery(name = "Hotels.findByPool", query = "SELECT h FROM Hotels h WHERE h.pool = :pool")
    , @NamedQuery(name = "Hotels.findByBeachFrontage", query = "SELECT h FROM Hotels h WHERE h.beachFrontage = :beachFrontage")
    , @NamedQuery(name = "Hotels.findByGymFitCtr", query = "SELECT h FROM Hotels h WHERE h.gymFitCtr = :gymFitCtr")
    , @NamedQuery(name = "Hotels.findByDisco", query = "SELECT h FROM Hotels h WHERE h.disco = :disco")
    , @NamedQuery(name = "Hotels.findByKarakoe", query = "SELECT h FROM Hotels h WHERE h.karakoe = :karakoe")
    , @NamedQuery(name = "Hotels.findByOutdoorSports", query = "SELECT h FROM Hotels h WHERE h.outdoorSports = :outdoorSports")
    , @NamedQuery(name = "Hotels.findByIndoorSports", query = "SELECT h FROM Hotels h WHERE h.indoorSports = :indoorSports")
    , @NamedQuery(name = "Hotels.findByWaterSports", query = "SELECT h FROM Hotels h WHERE h.waterSports = :waterSports")
    , @NamedQuery(name = "Hotels.findByNoRestaurants", query = "SELECT h FROM Hotels h WHERE h.noRestaurants = :noRestaurants")
    , @NamedQuery(name = "Hotels.findByNoBars", query = "SELECT h FROM Hotels h WHERE h.noBars = :noBars")
    , @NamedQuery(name = "Hotels.findByNoRoomsTotal", query = "SELECT h FROM Hotels h WHERE h.noRoomsTotal = :noRoomsTotal")
    , @NamedQuery(name = "Hotels.findByNoRoomsAc", query = "SELECT h FROM Hotels h WHERE h.noRoomsAc = :noRoomsAc")
    , @NamedQuery(name = "Hotels.findByNoRoomsNonAc", query = "SELECT h FROM Hotels h WHERE h.noRoomsNonAc = :noRoomsNonAc")
    , @NamedQuery(name = "Hotels.findByNoRoomsConn", query = "SELECT h FROM Hotels h WHERE h.noRoomsConn = :noRoomsConn")
    , @NamedQuery(name = "Hotels.findByNoRoomsWithTub", query = "SELECT h FROM Hotels h WHERE h.noRoomsWithTub = :noRoomsWithTub")
    , @NamedQuery(name = "Hotels.findByAcHeating", query = "SELECT h FROM Hotels h WHERE h.acHeating = :acHeating")
    , @NamedQuery(name = "Hotels.findByPipedMusic", query = "SELECT h FROM Hotels h WHERE h.pipedMusic = :pipedMusic")
    , @NamedQuery(name = "Hotels.findByIndBalcony", query = "SELECT h FROM Hotels h WHERE h.indBalcony = :indBalcony")
    , @NamedQuery(name = "Hotels.findByRadio", query = "SELECT h FROM Hotels h WHERE h.radio = :radio")
    , @NamedQuery(name = "Hotels.findByTv", query = "SELECT h FROM Hotels h WHERE h.tv = :tv")
    , @NamedQuery(name = "Hotels.findByIdd", query = "SELECT h FROM Hotels h WHERE h.idd = :idd")
    , @NamedQuery(name = "Hotels.findByMiniBar", query = "SELECT h FROM Hotels h WHERE h.miniBar = :miniBar")
    , @NamedQuery(name = "Hotels.findByKingSizeBeds", query = "SELECT h FROM Hotels h WHERE h.kingSizeBeds = :kingSizeBeds")
    , @NamedQuery(name = "Hotels.findByCots", query = "SELECT h FROM Hotels h WHERE h.cots = :cots")
    , @NamedQuery(name = "Hotels.findByHighChairs", query = "SELECT h FROM Hotels h WHERE h.highChairs = :highChairs")
    , @NamedQuery(name = "Hotels.findByBabyPool", query = "SELECT h FROM Hotels h WHERE h.babyPool = :babyPool")
    , @NamedQuery(name = "Hotels.findByKiddiesCorner", query = "SELECT h FROM Hotels h WHERE h.kiddiesCorner = :kiddiesCorner")
    , @NamedQuery(name = "Hotels.findByCreatedUser", query = "SELECT h FROM Hotels h WHERE h.createdUser = :createdUser")
    , @NamedQuery(name = "Hotels.findByCreatedDate", query = "SELECT h FROM Hotels h WHERE h.createdDate = :createdDate")
    , @NamedQuery(name = "Hotels.findByModifiedUser", query = "SELECT h FROM Hotels h WHERE h.modifiedUser = :modifiedUser")
    , @NamedQuery(name = "Hotels.findByModifiedDate", query = "SELECT h FROM Hotels h WHERE h.modifiedDate = :modifiedDate")
    , @NamedQuery(name = "Hotels.findByCurCode", query = "SELECT h FROM Hotels h WHERE h.curCode = :curCode")
    , @NamedQuery(name = "Hotels.findByCancellationPolicy", query = "SELECT h FROM Hotels h WHERE h.cancellationPolicy = :cancellationPolicy")
    , @NamedQuery(name = "Hotels.findByAccCode", query = "SELECT h FROM Hotels h WHERE h.accCode = :accCode")
    , @NamedQuery(name = "Hotels.findByTwinBeds", query = "SELECT h FROM Hotels h WHERE h.twinBeds = :twinBeds")
    , @NamedQuery(name = "Hotels.findByDoubleSizeBeds", query = "SELECT h FROM Hotels h WHERE h.doubleSizeBeds = :doubleSizeBeds")
    , @NamedQuery(name = "Hotels.findByOneBedWTwoMats", query = "SELECT h FROM Hotels h WHERE h.oneBedWTwoMats = :oneBedWTwoMats")
    , @NamedQuery(name = "Hotels.findByTwoSeparateBeds", query = "SELECT h FROM Hotels h WHERE h.twoSeparateBeds = :twoSeparateBeds")
    , @NamedQuery(name = "Hotels.findByMaxPaxInRoom", query = "SELECT h FROM Hotels h WHERE h.maxPaxInRoom = :maxPaxInRoom")
    , @NamedQuery(name = "Hotels.findByExtraBedsInRoom", query = "SELECT h FROM Hotels h WHERE h.extraBedsInRoom = :extraBedsInRoom")
    , @NamedQuery(name = "Hotels.findByDvd", query = "SELECT h FROM Hotels h WHERE h.dvd = :dvd")
    , @NamedQuery(name = "Hotels.findByFan", query = "SELECT h FROM Hotels h WHERE h.fan = :fan")
    , @NamedQuery(name = "Hotels.findByCoffeeMakFacl", query = "SELECT h FROM Hotels h WHERE h.coffeeMakFacl = :coffeeMakFacl")
    , @NamedQuery(name = "Hotels.findByInternetFacl", query = "SELECT h FROM Hotels h WHERE h.internetFacl = :internetFacl")
    , @NamedQuery(name = "Hotels.findByInetWireless", query = "SELECT h FROM Hotels h WHERE h.inetWireless = :inetWireless")
    , @NamedQuery(name = "Hotels.findByInetWired", query = "SELECT h FROM Hotels h WHERE h.inetWired = :inetWired")
    , @NamedQuery(name = "Hotels.findBySquareFeetRoom", query = "SELECT h FROM Hotels h WHERE h.squareFeetRoom = :squareFeetRoom")
    , @NamedQuery(name = "Hotels.findByBadmintonCourt", query = "SELECT h FROM Hotels h WHERE h.badmintonCourt = :badmintonCourt")
    , @NamedQuery(name = "Hotels.findByTennisCourt", query = "SELECT h FROM Hotels h WHERE h.tennisCourt = :tennisCourt")
    , @NamedQuery(name = "Hotels.findByDoctorOnCall", query = "SELECT h FROM Hotels h WHERE h.doctorOnCall = :doctorOnCall")
    , @NamedQuery(name = "Hotels.findByBabysitter", query = "SELECT h FROM Hotels h WHERE h.babysitter = :babysitter")
    , @NamedQuery(name = "Hotels.findBySuperiorRooms", query = "SELECT h FROM Hotels h WHERE h.superiorRooms = :superiorRooms")
    , @NamedQuery(name = "Hotels.findByDeluxeRooms", query = "SELECT h FROM Hotels h WHERE h.deluxeRooms = :deluxeRooms")
    , @NamedQuery(name = "Hotels.findByActive", query = "SELECT h FROM Hotels h WHERE h.active = :active")
    , @NamedQuery(name = "Hotels.findByAccLink2", query = "SELECT h FROM Hotels h WHERE h.accLink2 = :accLink2")
    , @NamedQuery(name = "Hotels.findByAccLink1", query = "SELECT h FROM Hotels h WHERE h.accLink1 = :accLink1")
    , @NamedQuery(name = "Hotels.findByStatus", query = "SELECT h FROM Hotels h WHERE h.status = :status")})
public class Hotels implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "MANAGING_COMPANY_SEQ")
    private Long managingCompanySeq;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE")
    private String code;
    @Size(max = 50)
    @Column(name = "SHORT_NAME")
    private String shortName;
    @Size(max = 50)
    @Column(name = "LONG_NAME")
    private String longName;
    @Size(max = 100)
    @Column(name = "LOCATION")
    private String location;
    @Size(max = 50)
    @Column(name = "ADDRESS_1")
    private String address1;
    @Size(max = 50)
    @Column(name = "ADDRESS_2")
    private String address2;
    @Size(max = 50)
    @Column(name = "ADDRESS_3")
    private String address3;
    @Size(max = 50)
    @Column(name = "WEB_SITE")
    private String webSite;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 15)
    @Column(name = "HOTEL_FAX_1")
    private String hotelFax1;
    @Size(max = 15)
    @Column(name = "HOTEL_FAX_2")
    private String hotelFax2;
    @Size(max = 15)
    @Column(name = "HOTEL_PHONE1")
    private String hotelPhone1;
    @Size(max = 15)
    @Column(name = "HOTEL_PHONE2")
    private String hotelPhone2;
    @Size(max = 1)
    @Column(name = "TB_CLASSIFICATION")
    private String tbClassification;
    @Size(max = 10)
    @Column(name = "PROPERTY_CODE")
    private String propertyCode;
    @Size(max = 1)
    @Column(name = "ENCASH_FC")
    private String encashFc;
    @Size(max = 1)
    @Column(name = "ACC_CREDIT_CARD")
    private String accCreditCard;
    @Size(max = 1)
    @Column(name = "SHOP_ARC")
    private String shopArc;
    @Size(max = 1)
    @Column(name = "PARKING")
    private String parking;
    @Size(max = 2)
    @Column(name = "RR_LIB")
    private String rrLib;
    @Size(max = 1)
    @Column(name = "HEALTH_CENTRE")
    private String healthCentre;
    @Size(max = 2)
    @Column(name = "DOCTOR")
    private String doctor;
    @Size(max = 1)
    @Column(name = "CONF_FAC")
    private String confFac;
    @Size(max = 1)
    @Column(name = "GUIDE_ACCOM")
    private String guideAccom;
    @Size(max = 1)
    @Column(name = "POOL")
    private String pool;
    @Size(max = 1)
    @Column(name = "BEACH_FRONTAGE")
    private String beachFrontage;
    @Size(max = 1)
    @Column(name = "GYM_FIT_CTR")
    private String gymFitCtr;
    @Size(max = 1)
    @Column(name = "DISCO")
    private String disco;
    @Size(max = 1)
    @Column(name = "KARAKOE")
    private String karakoe;
    @Size(max = 2)
    @Column(name = "OUTDOOR_SPORTS")
    private String outdoorSports;
    @Size(max = 2)
    @Column(name = "INDOOR_SPORTS")
    private String indoorSports;
    @Size(max = 1)
    @Column(name = "WATER_SPORTS")
    private String waterSports;
    @Column(name = "NO_RESTAURANTS")
    private Short noRestaurants;
    @Column(name = "NO_BARS")
    private Short noBars;
    @Column(name = "NO_ROOMS_TOTAL")
    private Short noRoomsTotal;
    @Column(name = "NO_ROOMS_AC")
    private Short noRoomsAc;
    @Column(name = "NO_ROOMS_NON_AC")
    private Short noRoomsNonAc;
    @Column(name = "NO_ROOMS_CONN")
    private Short noRoomsConn;
    @Column(name = "NO_ROOMS_WITH_TUB")
    private Short noRoomsWithTub;
    @Size(max = 1)
    @Column(name = "AC_HEATING")
    private String acHeating;
    @Size(max = 1)
    @Column(name = "PIPED_MUSIC")
    private String pipedMusic;
    @Size(max = 1)
    @Column(name = "IND_BALCONY")
    private String indBalcony;
    @Size(max = 1)
    @Column(name = "RADIO")
    private String radio;
    @Size(max = 1)
    @Column(name = "TV")
    private String tv;
    @Size(max = 1)
    @Column(name = "IDD")
    private String idd;
    @Size(max = 1)
    @Column(name = "MINI_BAR")
    private String miniBar;
    @Size(max = 1)
    @Column(name = "KING_SIZE_BEDS")
    private String kingSizeBeds;
    @Size(max = 1)
    @Column(name = "COTS")
    private String cots;
    @Size(max = 1)
    @Column(name = "HIGH_CHAIRS")
    private String highChairs;
    @Size(max = 1)
    @Column(name = "BABY_POOL")
    private String babyPool;
    @Size(max = 1)
    @Column(name = "KIDDIES_CORNER")
    private String kiddiesCorner;
    @Size(max = 30)
    @Column(name = "CREATED_USER")
    private String createdUser;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Size(max = 30)
    @Column(name = "MODIFIED_USER")
    private String modifiedUser;
    @Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @Size(max = 10)
    @Column(name = "CUR_CODE")
    private String curCode;
    @Size(max = 4000)
    @Column(name = "CANCELLATION_POLICY")
    private String cancellationPolicy;
    @Size(max = 15)
    @Column(name = "ACC_CODE")
    private String accCode;
    @Size(max = 1)
    @Column(name = "TWIN_BEDS")
    private String twinBeds;
    @Size(max = 1)
    @Column(name = "DOUBLE_SIZE_BEDS")
    private String doubleSizeBeds;
    @Size(max = 1)
    @Column(name = "ONE_BED_W_TWO_MATS")
    private String oneBedWTwoMats;
    @Size(max = 1)
    @Column(name = "TWO_SEPARATE_BEDS")
    private String twoSeparateBeds;
    @Column(name = "MAX_PAX_IN_ROOM")
    private Short maxPaxInRoom;
    @Size(max = 1)
    @Column(name = "EXTRA_BEDS_IN_ROOM")
    private String extraBedsInRoom;
    @Size(max = 1)
    @Column(name = "DVD")
    private String dvd;
    @Size(max = 1)
    @Column(name = "FAN")
    private String fan;
    @Size(max = 1)
    @Column(name = "COFFEE_MAK_FACL")
    private String coffeeMakFacl;
    @Size(max = 1)
    @Column(name = "INTERNET_FACL")
    private String internetFacl;
    @Size(max = 1)
    @Column(name = "INET_WIRELESS")
    private String inetWireless;
    @Size(max = 1)
    @Column(name = "INET_WIRED")
    private String inetWired;
    @Size(max = 20)
    @Column(name = "SQUARE_FEET_ROOM")
    private String squareFeetRoom;
    @Size(max = 1)
    @Column(name = "BADMINTON_COURT")
    private String badmintonCourt;
    @Size(max = 1)
    @Column(name = "TENNIS_COURT")
    private String tennisCourt;
    @Size(max = 1)
    @Column(name = "DOCTOR_ON_CALL")
    private String doctorOnCall;
    @Size(max = 1)
    @Column(name = "BABYSITTER")
    private String babysitter;
    @Column(name = "SUPERIOR_ROOMS")
    private Short superiorRooms;
    @Column(name = "DELUXE_ROOMS")
    private Short deluxeRooms;
    @Size(max = 1)
    @Column(name = "ACTIVE")
    private String active;
    @Column(name = "ACC_LINK2")
    private BigInteger accLink2;
    @Column(name = "ACC_LINK1")
    private BigInteger accLink1;
    @Column(name = "STATUS")
    private BigInteger status;

    public Hotels() {
    }

    public Hotels(String code) {
        this.code = code;
    }

    public Long getManagingCompanySeq() {
        return managingCompanySeq;
    }

    public void setManagingCompanySeq(Long managingCompanySeq) {
        this.managingCompanySeq = managingCompanySeq;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHotelFax1() {
        return hotelFax1;
    }

    public void setHotelFax1(String hotelFax1) {
        this.hotelFax1 = hotelFax1;
    }

    public String getHotelFax2() {
        return hotelFax2;
    }

    public void setHotelFax2(String hotelFax2) {
        this.hotelFax2 = hotelFax2;
    }

    public String getHotelPhone1() {
        return hotelPhone1;
    }

    public void setHotelPhone1(String hotelPhone1) {
        this.hotelPhone1 = hotelPhone1;
    }

    public String getHotelPhone2() {
        return hotelPhone2;
    }

    public void setHotelPhone2(String hotelPhone2) {
        this.hotelPhone2 = hotelPhone2;
    }

    public String getTbClassification() {
        return tbClassification;
    }

    public void setTbClassification(String tbClassification) {
        this.tbClassification = tbClassification;
    }

    public String getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }

    public String getEncashFc() {
        return encashFc;
    }

    public void setEncashFc(String encashFc) {
        this.encashFc = encashFc;
    }

    public String getAccCreditCard() {
        return accCreditCard;
    }

    public void setAccCreditCard(String accCreditCard) {
        this.accCreditCard = accCreditCard;
    }

    public String getShopArc() {
        return shopArc;
    }

    public void setShopArc(String shopArc) {
        this.shopArc = shopArc;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public String getRrLib() {
        return rrLib;
    }

    public void setRrLib(String rrLib) {
        this.rrLib = rrLib;
    }

    public String getHealthCentre() {
        return healthCentre;
    }

    public void setHealthCentre(String healthCentre) {
        this.healthCentre = healthCentre;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getConfFac() {
        return confFac;
    }

    public void setConfFac(String confFac) {
        this.confFac = confFac;
    }

    public String getGuideAccom() {
        return guideAccom;
    }

    public void setGuideAccom(String guideAccom) {
        this.guideAccom = guideAccom;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public String getBeachFrontage() {
        return beachFrontage;
    }

    public void setBeachFrontage(String beachFrontage) {
        this.beachFrontage = beachFrontage;
    }

    public String getGymFitCtr() {
        return gymFitCtr;
    }

    public void setGymFitCtr(String gymFitCtr) {
        this.gymFitCtr = gymFitCtr;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public String getKarakoe() {
        return karakoe;
    }

    public void setKarakoe(String karakoe) {
        this.karakoe = karakoe;
    }

    public String getOutdoorSports() {
        return outdoorSports;
    }

    public void setOutdoorSports(String outdoorSports) {
        this.outdoorSports = outdoorSports;
    }

    public String getIndoorSports() {
        return indoorSports;
    }

    public void setIndoorSports(String indoorSports) {
        this.indoorSports = indoorSports;
    }

    public String getWaterSports() {
        return waterSports;
    }

    public void setWaterSports(String waterSports) {
        this.waterSports = waterSports;
    }

    public Short getNoRestaurants() {
        return noRestaurants;
    }

    public void setNoRestaurants(Short noRestaurants) {
        this.noRestaurants = noRestaurants;
    }

    public Short getNoBars() {
        return noBars;
    }

    public void setNoBars(Short noBars) {
        this.noBars = noBars;
    }

    public Short getNoRoomsTotal() {
        return noRoomsTotal;
    }

    public void setNoRoomsTotal(Short noRoomsTotal) {
        this.noRoomsTotal = noRoomsTotal;
    }

    public Short getNoRoomsAc() {
        return noRoomsAc;
    }

    public void setNoRoomsAc(Short noRoomsAc) {
        this.noRoomsAc = noRoomsAc;
    }

    public Short getNoRoomsNonAc() {
        return noRoomsNonAc;
    }

    public void setNoRoomsNonAc(Short noRoomsNonAc) {
        this.noRoomsNonAc = noRoomsNonAc;
    }

    public Short getNoRoomsConn() {
        return noRoomsConn;
    }

    public void setNoRoomsConn(Short noRoomsConn) {
        this.noRoomsConn = noRoomsConn;
    }

    public Short getNoRoomsWithTub() {
        return noRoomsWithTub;
    }

    public void setNoRoomsWithTub(Short noRoomsWithTub) {
        this.noRoomsWithTub = noRoomsWithTub;
    }

    public String getAcHeating() {
        return acHeating;
    }

    public void setAcHeating(String acHeating) {
        this.acHeating = acHeating;
    }

    public String getPipedMusic() {
        return pipedMusic;
    }

    public void setPipedMusic(String pipedMusic) {
        this.pipedMusic = pipedMusic;
    }

    public String getIndBalcony() {
        return indBalcony;
    }

    public void setIndBalcony(String indBalcony) {
        this.indBalcony = indBalcony;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getIdd() {
        return idd;
    }

    public void setIdd(String idd) {
        this.idd = idd;
    }

    public String getMiniBar() {
        return miniBar;
    }

    public void setMiniBar(String miniBar) {
        this.miniBar = miniBar;
    }

    public String getKingSizeBeds() {
        return kingSizeBeds;
    }

    public void setKingSizeBeds(String kingSizeBeds) {
        this.kingSizeBeds = kingSizeBeds;
    }

    public String getCots() {
        return cots;
    }

    public void setCots(String cots) {
        this.cots = cots;
    }

    public String getHighChairs() {
        return highChairs;
    }

    public void setHighChairs(String highChairs) {
        this.highChairs = highChairs;
    }

    public String getBabyPool() {
        return babyPool;
    }

    public void setBabyPool(String babyPool) {
        this.babyPool = babyPool;
    }

    public String getKiddiesCorner() {
        return kiddiesCorner;
    }

    public void setKiddiesCorner(String kiddiesCorner) {
        this.kiddiesCorner = kiddiesCorner;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCurCode() {
        return curCode;
    }

    public void setCurCode(String curCode) {
        this.curCode = curCode;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public String getAccCode() {
        return accCode;
    }

    public void setAccCode(String accCode) {
        this.accCode = accCode;
    }

    public String getTwinBeds() {
        return twinBeds;
    }

    public void setTwinBeds(String twinBeds) {
        this.twinBeds = twinBeds;
    }

    public String getDoubleSizeBeds() {
        return doubleSizeBeds;
    }

    public void setDoubleSizeBeds(String doubleSizeBeds) {
        this.doubleSizeBeds = doubleSizeBeds;
    }

    public String getOneBedWTwoMats() {
        return oneBedWTwoMats;
    }

    public void setOneBedWTwoMats(String oneBedWTwoMats) {
        this.oneBedWTwoMats = oneBedWTwoMats;
    }

    public String getTwoSeparateBeds() {
        return twoSeparateBeds;
    }

    public void setTwoSeparateBeds(String twoSeparateBeds) {
        this.twoSeparateBeds = twoSeparateBeds;
    }

    public Short getMaxPaxInRoom() {
        return maxPaxInRoom;
    }

    public void setMaxPaxInRoom(Short maxPaxInRoom) {
        this.maxPaxInRoom = maxPaxInRoom;
    }

    public String getExtraBedsInRoom() {
        return extraBedsInRoom;
    }

    public void setExtraBedsInRoom(String extraBedsInRoom) {
        this.extraBedsInRoom = extraBedsInRoom;
    }

    public String getDvd() {
        return dvd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public String getFan() {
        return fan;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }

    public String getCoffeeMakFacl() {
        return coffeeMakFacl;
    }

    public void setCoffeeMakFacl(String coffeeMakFacl) {
        this.coffeeMakFacl = coffeeMakFacl;
    }

    public String getInternetFacl() {
        return internetFacl;
    }

    public void setInternetFacl(String internetFacl) {
        this.internetFacl = internetFacl;
    }

    public String getInetWireless() {
        return inetWireless;
    }

    public void setInetWireless(String inetWireless) {
        this.inetWireless = inetWireless;
    }

    public String getInetWired() {
        return inetWired;
    }

    public void setInetWired(String inetWired) {
        this.inetWired = inetWired;
    }

    public String getSquareFeetRoom() {
        return squareFeetRoom;
    }

    public void setSquareFeetRoom(String squareFeetRoom) {
        this.squareFeetRoom = squareFeetRoom;
    }

    public String getBadmintonCourt() {
        return badmintonCourt;
    }

    public void setBadmintonCourt(String badmintonCourt) {
        this.badmintonCourt = badmintonCourt;
    }

    public String getTennisCourt() {
        return tennisCourt;
    }

    public void setTennisCourt(String tennisCourt) {
        this.tennisCourt = tennisCourt;
    }

    public String getDoctorOnCall() {
        return doctorOnCall;
    }

    public void setDoctorOnCall(String doctorOnCall) {
        this.doctorOnCall = doctorOnCall;
    }

    public String getBabysitter() {
        return babysitter;
    }

    public void setBabysitter(String babysitter) {
        this.babysitter = babysitter;
    }

    public Short getSuperiorRooms() {
        return superiorRooms;
    }

    public void setSuperiorRooms(Short superiorRooms) {
        this.superiorRooms = superiorRooms;
    }

    public Short getDeluxeRooms() {
        return deluxeRooms;
    }

    public void setDeluxeRooms(Short deluxeRooms) {
        this.deluxeRooms = deluxeRooms;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public BigInteger getAccLink2() {
        return accLink2;
    }

    public void setAccLink2(BigInteger accLink2) {
        this.accLink2 = accLink2;
    }

    public BigInteger getAccLink1() {
        return accLink1;
    }

    public void setAccLink1(BigInteger accLink1) {
        this.accLink1 = accLink1;
    }

    public BigInteger getStatus() {
        return status;
    }

    public void setStatus(BigInteger status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hotels)) {
            return false;
        }
        Hotels other = (Hotels) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.testspring.entity.Hotels[ code=" + code + " ]";
    }
    
}
