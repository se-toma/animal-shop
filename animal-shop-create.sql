-- Project Name : アニマル商店
-- Date/Time    : 2021/08/22 16:10:41
-- Author       : tomag
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

/*
  << 注意！！ >>
  BackupToTempTable, RestoreFromTempTable疑似命令が付加されています。
  これにより、drop table, create table 後もデータが残ります。
  この機能は一時的に $$TableName のような一時テーブルを作成します。
  この機能は A5:SQL Mk-2でのみ有効であることに注意してください。
*/

-- 販売履歴
--* RestoreFromTempTable
create table sales_history (
  sales_id integer not null
  , shohin_id integer not null
  , sales_quantity integer not null
  , date date not null
  , constraint sales_history_PKC primary key (sales_id)
) ;

-- 商品マスタ
--* RestoreFromTempTable
create table shohin_mst (
  shohin_id integer not null
  , shohin_name character varying not null
  , shohin_price numeric(10,0) not null
  , constraint shohin_mst_PKC primary key (shohin_id)
) ;

comment on table sales_history is '販売履歴';
comment on column sales_history.sales_id is '販売ID';
comment on column sales_history.shohin_id is '商品ID';
comment on column sales_history.sales_quantity is '販売数量';
comment on column sales_history.date is '日付';

comment on table shohin_mst is '商品マスタ';
comment on column shohin_mst.shohin_id is '商品ID';
comment on column shohin_mst.shohin_name is '商品名';
comment on column shohin_mst.shohin_price is '販売価格';

