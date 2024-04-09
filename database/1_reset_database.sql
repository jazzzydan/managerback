-- Kustutab public schema (mis põhimõtteliselt kustutab kõik tabelid)
DROP SCHEMA manager CASCADE;
-- Loob uue public schema vajalikud õigused
CREATE SCHEMA manager
-- taastab vajalikud andmebaasi õigused
    GRANT ALL ON SCHEMA manager TO postgres;
GRANT ALL ON SCHEMA manager TO PUBLIC;