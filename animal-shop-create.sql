-- Project Name : �A�j�}�����X
-- Date/Time    : 2021/08/22 16:10:41
-- Author       : tomag
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

/*
  << ���ӁI�I >>
  BackupToTempTable, RestoreFromTempTable�^�����߂��t������Ă��܂��B
  ����ɂ��Adrop table, create table ����f�[�^���c��܂��B
  ���̋@�\�͈ꎞ�I�� $$TableName �̂悤�Ȉꎞ�e�[�u�����쐬���܂��B
  ���̋@�\�� A5:SQL Mk-2�ł̂ݗL���ł��邱�Ƃɒ��ӂ��Ă��������B
*/

-- �̔�����
--* RestoreFromTempTable
create table sales_history (
  sales_id integer not null
  , shohin_id integer not null
  , sales_quantity integer not null
  , date date not null
  , constraint sales_history_PKC primary key (sales_id)
) ;

-- ���i�}�X�^
--* RestoreFromTempTable
create table shohin_mst (
  shohin_id integer not null
  , shohin_name character varying not null
  , shohin_price numeric(10,0) not null
  , constraint shohin_mst_PKC primary key (shohin_id)
) ;

comment on table sales_history is '�̔�����';
comment on column sales_history.sales_id is '�̔�ID';
comment on column sales_history.shohin_id is '���iID';
comment on column sales_history.sales_quantity is '�̔�����';
comment on column sales_history.date is '���t';

comment on table shohin_mst is '���i�}�X�^';
comment on column shohin_mst.shohin_id is '���iID';
comment on column shohin_mst.shohin_name is '���i��';
comment on column shohin_mst.shohin_price is '�̔����i';

