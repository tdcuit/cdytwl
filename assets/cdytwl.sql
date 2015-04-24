drop user cdytwl cascade;
create user cdytwl identified by cdytwl;
grant connect,resource,dba to cdytwl; 

create tablespace cdytwl  
logging  
datafile 'H:\orcl\oradata\cdytwl\cdytwl.dbf' 
size 200m  
autoextend on  
next 50m maxsize 20480m  
extent management local;

alter user cdytwl default tablespace cdytwl;

-- Create sequence 
create sequence HIBERNATE_SEQUENCE
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


------------------------------------------------------------


/* 订单信息 */
create table ORDERINFO
(
     "ID" number(10) not null primary key,          
     BIDDINGPRICEWAYID number(10),
     SETOFFADDRESSID number(10),
     DESTINATIONADDRESSID number(10),
     WHETHERPADFUNDED number(1),
     PADFUNDEDMONEY number(10,1),
     TOTALMONEY number(10,1),
     DIFFERMONEY number(10,1),
     WHETHERCASHONDELIVERY varchar(1),
     SIGNRECEIPTMONEY number(10,1),
     PUNCHCARDMONEY number(10,1),
     WHETHERPICKUPGOODS varchar(1),
     DELIVERGOODSTYPEID number(10),
     WHETHERDELIVERGOODS varchar(1),
     WHETHERINSURE varchar(1),
     DIFFERMONEYCONFIRM varchar(1),
     TRADEFINISHEDCONFIRM varchar(1),
     ARRIVALGOODSCONFIRM varchar(1),
     RECEIPTORDERCONFIRM varchar(1),
     MILEAGE number(5,2),
     "comment" varchar(256)
);
/* 地址 */
create table ADDRESS
(
       "ID" number(10) not null primary key, 
       PROVINCE varchar(64),
       CITY varchar(64),
       COUNTY varchar(64),
       STREET varchar(128),
       HOUSENUMBER varchar(64),
       ADDRESSDES varchar(128),
       POSTCODE number(6)
);

/* 挂单用户关系表 */
create table PUTORDERUSERRS
(
        "ID" number(10) not null primary key,
        PUTORDERUSERID number(10) not null,
        ORDERID number(10) not null
);


/* 货物图片关系表 */
create table GOODSPICRS
(
      "ID" number(10) not null primary key,
      GOODSID number(10) not null,
      PICID number(10) not null
       
);


/* 订单抢单用户关系表 */
create table ORDERSCRAMBLEORDERUSERRS
(
        "ID" number(10) not null primary key,
        SCRAMBLEORDERUSERID number(10) not null,
        ORDERID number(10) not null
);
/* 订单（回单）图关系表 */
create table ORDERRECEIPTORDERPICRS
(
        "ID" number(10) not null primary key,
        RECEIPTORDERPICID number(10) not null,
        ORDERID number(10) not null
);
/* 货 */
create table GOODS
(
        "ID" number(10) not null primary key,
        GOODSTYPEID number(10) not null,
        SHIPMENTTIME DATE not null,
        ARRIVALGOODSTIME DATE not null,
        WEIGHT number(5,3) not null,
        DELIVERGOODSTYPEID number(10) not null,
        SHIPPINGPRICE NUMBER(10,1),
        ORDERID number(10)
);

/* 货物类型 */
create table GOODSTYPE
(
       "ID" number(10) not null primary key,
       GOODSTYPECODE varchar(32) not null,
       GOODSTYPENAME varchar(512) not null
);
/* 发货类型 */
create table  DELIVERGOODSTYPE
(
        "ID" number(10) not null primary key,
        DELIVERGOODSCODE varchar(32) not null,
        DELIVERGOODSTYPENAME varchar(512) not null
);
/* 车 */
create table CAR
(
       "ID" number(10) not null primary key,
       CARTYPEID number(10),
       CARMODELID number(10),
       LICENSEPLATENUMBER varchar(16),
       USERID number(10)
       
);
/* 车种类型表 */
create table CARTYPE
(
       "ID" number(10) not null primary key,
       CARTYPECODE varchar(32) not null,
       CARTYPENAME varchar(512) not null
       
);
/* 车型表 */
create table CARMODEL
(
        "ID" number(10) not null primary key,
        CARMODELCODE varchar(32) not null,
        CARMODELNAME varchar(512) not null
);
/* 图 */
create table PIC
(
       "ID" number(10) not null primary key,
       THUMBNAILPIC blob,
       ORIGINALPIC blob,
       PICNAME varchar(256),
       PICDES varchar(512)
       
);
/* 出价方式 */
create table BIDDINGPRICEWAY
(
       "ID" number(10) not null primary key,
       BIDDINGPRICECODE varchar(32) not null,
       BIDDINGPRICENAME varchar(256) not null
);
/* 保单 */
create table INSURANCESHEET
(
       "ID" number(10) not null primary key,
       INSURANCESHEETMONEY number(10,1) not null,
       INSURANCESHEETNAME varchar(256),
       INSURANCESHEETRATE number(1,3) not null,
       ORDERID number(10)
);
/* 报价表 */
create table REPORTPRICE
(
        "ID" number(10) not null primary key,
        REPORTPRICEUSERID number(10),
        REPORTMONEY number(10,1),
        ORDERID number(10)
);
/* 出价表 */
create table BIDDINGPRICE
(
       "ID" number(10) not null primary key,
       BIDDINGPRICEUSERID number(10),
       BIDDINGMONEY number(10,1),
       ORDERID number(10),
       BIDDINGPRICEWAYID number(10)
);
/* 用户表 */
create table USERINFO
(
        ID number(10) not null primary key,
        NICKNAME varchar(128),
        USERNAME varchar(128),
        HEADPICID number(10),
        EMAIL varchar(128),
        TELEPHONE number(10),
        DRIVERLICENSE varchar(128),
        VEHICLELICENSE varchar(128),
        IDENTITYCARDNUMBER varchar(128),
        PASSWORD           VARCHAR2(32),
  		CONFIRMPASSWORD    VARCHAR2(32)
        
);



/* 银行卡 */
create table BANKCARD
(
       "ID" number(10) not null primary key,
       BANKCARDNUMBER number(10) not null,
       BANKCARDNAME varchar(128) not null,
       BANKNAME varchar(128) not null,
       BANKACCOUTNAME varchar(128) not null,
       BANKCARDDES varchar(258),
       USERID number(10),
       CORPID number(10)
);
/* 公司信息 */
create table COMPANY
(
       "ID" number(10) not null primary key,
       CORPNAME varchar(128) not null,
       CORPREGISTERNUMBER varchar(128),
       CORPHEADPICID number(10),
       COMPANYTYPEID number(10),
       CORPADDRESSID number(10),
       TELEPHONE number(10),
       TEL number(10),
       BUSINESSLICENSEPICID number(10),
       TAXREGISTRYNUMBER varchar(128),
       LEGALPERSONID number(10)
);

/* 公司种类（行业） */
create table COMPANYTYPE
(
      "ID" number(10) not null primary key,
      INDUSTRYCODE varchar(32),
      INDUSTRYDES varchar(258)
        
);
/* 线路  */
create table ROUTELINE
(
       "ID" number(10) not null primary key,
       SETOFFPOSTCODE number(6),
       DESTINATIONPOSTCODE number(6),
       SETOFFPROVINCE varchar(32),
       DESTINATIONPROVINCE varchar(32),
       SETOFFCITY varchar(32),
       DESTINATIONCITY varchar(32),
       SETOFFCOUNTY varchar(32),
       DESTINATIONCOUNTY varchar(32),
       SETOFFSTREET varchar(128),
       DESTINATIONSTREET varchar(128)
       
);
/* 订单公司关系表 */
create table ORDERCOMPANYTYPERS
(
       "ID" number(10) not null primary key,
       CORPID number(10) not null,
       ORDERID number(10) not null
);


----------------------------------------------------



create sequence ADDRESS_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;



create sequence BANKCARD_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence BIDDINGPRICE_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence BIDDINGPRICEWAY_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence CAR_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence CARMODEL_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence CARTYPE_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence COMPANY_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence COMPANYTYPE_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence DELIVERGOODSTYPE_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence GOODS_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence GOODSPIC_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence GOODSTYPE_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence INSURANCESHEET_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;

create sequence ORDERCOMPANYTYPE_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence ORDERINFO_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence ORDERRECEIPTORDERPIC_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;



create sequence ORDERSCRAMBLEORDERUSER_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence PIC_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence PUTORDERUSER_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence REPORTPRICE_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence ROUTELINE_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;


create sequence USERINFO_SEQ
minvalue 20
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;




----------------------------------------------------------------------























--http://wenku.baidu.com/link?url=H6D_eHko2ON7sVVL9UNuYLZxfW9aDvg3u18486acb4brYPqto__NWlJ3IIFZseFLoZHII5EL22vBcIsjDGGcaJhs3TZXv7nuXY0GHorFjzq
--权限表
create table ACTION
 (
   ACTIONID      NUMBER(10) not null,
   ACTION_NAME    VARCHAR2(255),
   ACTION VARCHAR2(255),
   VIEW_MODE VARCHAR2(255)  --0 不启用  1 启用
 )
 insert into ACTION (ID, ACTION_NAME, ACTION, VIEW_MODE) values (1, '权限初始化安装', 'setup', 0);
 insert into ACTION (ID, ACTION_NAME, ACTION, VIEW_MODE) values (2, '添加管理组', 'addnewgroup', 1);
 insert into ACTION (ID, ACTION_NAME, ACTION, VIEW_MODE) values (3, '删除管理组', 'deletenewgroup', 0);
 commit;

 --权限映射表ACTION.ACTION
 create table ACTION_GROUP
 (
   ID      NUMBER(10) not null,
   ACTION   VARCHAR2(255),
   GROUPID NUMBER(10),
   MASTERID
   MASTERNAME
   CREATE_DATE 
 )
 insert into ACTION (ID, ACTION, GROUPID, MASTERID, MASTERNAME, CREATE_DATE) values (0, 'setup', 1, 1, );
 commit;
--管理组表ACTION_GROUP.GROUPID GROUP_MANAGER.GROUPID
  create table GROUP_MANAGER
 (
   GROUPID      NUMBER(10) not null,
   GROUPNAME   VARCHAR2(255),
   GROUPINFO NUMBER(10),
   MASTERID
   MASTERNAME
   CREATE_DATE
 )
 
 --人员映射表GROUP_MANAGER.GROUPID  MASTER_GROUP.GROUPID
   create table MASTER_GROUP
 (
   ID      NUMBER(10) not null,
   MASTERID   VARCHAR2(255),
   NAME NUMBER(10),
   GROUPID
   MASTERID2
   MASTER_NAME
   CREATE_DATE
 )
 
--人员表 MASTER_GROUP.MASTERID MASTER.id
    create table MASTER
 (
   ID      NUMBER(10) not null,
   NAME   VARCHAR2(255),
   PASSWORD NUMBER(10),
   BDATE
   TRUENAME
   SEX
   BIRTH_DAY
   DEPT
   POSITION
   POSITION_DESC
   OFFICE_PHONE
   MOBILE
   HOME_PHONE
   EMAIL
   MASTERID
   MASTERNAME
   CREATE_DATE
 )