---------------------------------------------------------------
-- MOTIVO: Criação das tabelas do ParkingSpotControl
-- AD: Rafaella Costa
---------------------------------------------------------------

CREATE TABLE db_parking_control.parking_spot (
        des_parking_spot_number int(90) NOT NULL,
        des_busy varchar(6) NOT NULL,
        CONSTRAINT parkin_spot_pkey PRIMARY KEY (des_parking_spot_number)
);