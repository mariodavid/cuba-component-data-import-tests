-- begin DDCDIT_MLB_TEAM
create unique index IDX_DDCDIT_MLB_TEAM_UNQ on DDCDIT_MLB_TEAM (CODE, DELETE_TS) ^
-- end DDCDIT_MLB_TEAM
-- begin DDCDIT_MLB_PLAYER
alter table DDCDIT_MLB_PLAYER add constraint FK_DDCDIT_MLB_PLAYER_TEAM foreign key (TEAM_ID) references DDCDIT_MLB_TEAM(ID)^
create index IDX_DDCDIT_MLB_PLAYER_TEAM on DDCDIT_MLB_PLAYER (TEAM_ID)^
-- end DDCDIT_MLB_PLAYER