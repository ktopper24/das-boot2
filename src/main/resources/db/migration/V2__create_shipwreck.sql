/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  ktopper3
 * Created: Jun 21, 2016
 */


CREATE TABLE SHIPWRECK(
  ID INT AUTO_INCREMENT,
  NAME VARCHAR(255),
  DESCRIPTION VARCHAR(2000),
  CONDITION VARCHAR(255),
  DEPTH INT,
  LATITUDE DOUBLE,
  LONGITUDE DOUBLE,
  YEAR_DISCOVERED INT
);