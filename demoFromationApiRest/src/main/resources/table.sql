CREATE TABLE public.contrat (
                                id_contrat serial NOT NULL,
                                type_contrat character varying(100),
                                prix_mensualite double precision,
                                formule character varying(100)
);
CREATE TABLE public.client (
                               id_client serial NOT NULL,

                               nom_client character varying(100),
                               prenom_client character varying(100),

                               telephone_client character varying(100)
);
