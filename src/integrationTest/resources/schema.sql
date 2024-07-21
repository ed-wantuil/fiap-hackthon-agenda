create table agenda
(
    id    UUID primary key,
    crm   varchar(100)  not null,
    nome  varchar(100) not null,
    especialidade varchar(100) not null,
    endereco varchar(200) not null,
    avaliacao varchar(3) not null,
    valor number
);

create table agenda
(
    id          UUID primary key,
    medico_id        UUID not null,
    inicio    date  not null,
    fim       date        not null
);
