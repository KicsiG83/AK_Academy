
  CREATE TABLE "ADMIN"."USER_DATA" 
   (	"USER_ID" NUMBER(*,0) NOT NULL ENABLE, 
	"NAME" VARCHAR2(200 BYTE) NOT NULL ENABLE, 
	"PASSWORD" VARCHAR2(256 BYTE) NOT NULL ENABLE, 
	"EMAIL" VARCHAR2(40 BYTE) NOT NULL ENABLE, 
	"STATUS" VARCHAR2(10 BYTE) NOT NULL ENABLE, 
	 CONSTRAINT "USER_ID_PK" PRIMARY KEY ("USER_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "ADMIN"."USER_DATA"."USER_ID" IS 'USER_ID egyedi azonosítóval';
   COMMENT ON COLUMN "ADMIN"."USER_DATA"."NAME" IS 'Felhasználó neve';
   COMMENT ON COLUMN "ADMIN"."USER_DATA"."PASSWORD" IS 'Felhasználó jelszava SHA-256 hasheléssel';
   COMMENT ON COLUMN "ADMIN"."USER_DATA"."EMAIL" IS 'Felhasználó e-mail címe';
   COMMENT ON COLUMN "ADMIN"."USER_DATA"."STATUS" IS 'Felhasználó státusza';
