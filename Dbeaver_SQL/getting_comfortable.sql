SELECT * FROM player;
SELECT * FROM team;

insert into team 
values('3','Real Madrid');
SELECT * FROM team;

insert into player
values('103','Luka Modric','3');
SELECT * FROM player;

select * from player 
where team_id = '1';

select * from player 
where goals >2;

select * from player
group by player.id 
having goals >= 2;

alter table team
add wins int;

select * from team
group by team.team_id 
having max(wins)>6; 

select * from player
group by player.id 
having min(goals)<3;

select count(goals) from player;

select avg(goals) from player;

select sum(goals) from player;

select * from player
where dob = '1991-06-28';


