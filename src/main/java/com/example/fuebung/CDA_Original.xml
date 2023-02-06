<?xml version="1.0" encoding="iso-8859-1"?>
<?xml-stylesheet type="text/xsl" href="vhitg-cda-v3.xsl"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:sciphox="urn::sciphox-org/sciphox"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="urn:hl7-org:v3
    d:/Archiv/xml/schemata/20040420/CDA.xsd">
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_HD000040"/>
    <id extension="60256,79398" root="1.2.276.0.58"/>
    <code code="34106-5" codeSystem="2.16.840.1.113883.6.1" displayName="Zusammenfassung bei
        Entlassung aus Krankenhaus"/>
    <title>Vorläufiger Arztbrief</title>
    <effectiveTime value="200512222203"/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25"/>
    <languageCode code="DE"/>
    <setId extension="D1" root="2.16.840.1.113883.3.933"/>
    <versionNumber value="1"/>
    <recordTarget>
        <!--- Patienten-Daten -->
        <patientRole>
            <id extension="8112" root="2.16.840.1.113883.3.933"/>
            <addr>
                <streetName> ---STRASSENNAME(Patient)---</streetName>
                <houseNumber>---HAUSNUMMER(Patient)---</houseNumber>
                <postalCode>---PLZ(Patient)---</postalCode>
                <city>---STADT(Patient)---</city>
            </addr>
            <patient>
                <name>
                    <given>---VORNAME(Patient)---</given>
                    <family>---FAMILIENNAME(Patient)</family>
                </name>
                <!-- code="F -> weiblich; code="M" ->männlich -->
                <administrativeGenderCode code="F" codeSystem="2.16.840.1.113883.5.1"/>
                <!-- Geburtsdatum des Patienten -->
                <birthTime value="19450513"/>
            </patient>
            <providerOrganization>
                <telecom use="WP" value="tel:02421-12346"/>
                <telecom use="WP" value="fax:02421-12346"/>
                <addr>
                    <streetName>---STRASSENNAME(Arzt)---</streetName>
                    <houseNumber>---HAUSNUMMER(ARZT)---</houseNumber>
                    <postalCode>---PLZ(ARZT)---</postalCode>
                    <city>---STADT(ARZT)---</city>
                </addr>
            </providerOrganization>
        </patientRole>
    </recordTarget>
    <author>
        <!--- author -->
        <time value="20051222"/>
        <assignedAuthor>
            <id extension="1234567" root="2.16.840.1.113883.3.933"/>
            <assignedPerson>
                <name>
                    <prefix>---TITEL(Arzt)</prefix>
                    <given>
                        ---VORNAME(Arzt)---
                    </given>
                    <family>---FAMILIENNAME(Arzt)---</family>
                </name>
            </assignedPerson>
            <representedOrganization>
                <telecom use="WP" value="tel:02421-12345"/>
                <telecom use="WP" value="fax:02421-12346"/>
                <addr>
                    <streetName>---STRASSENAME(Arzt)---</streetName>
                    <houseNumber>---HAUSNUMMER(Arzt)---</houseNumber>
                    <postalCode>---PLZ(Arzt)---</postalCode>
                    <city>---STADT(Arzt)---</city>
                </addr>
            </representedOrganization>
        </assignedAuthor>
    </author>
    <custodian>
        <!--- Organisation von der das Dokument stammt -->
        <assignedCustodian>
            <representedCustodianOrganization>
                <id extension="M345" root="1.2.276.0.58"/>
                <addr>
                    <streetName>---STRASSENAME(Arzt)---</streetName>
                    <houseNumber>---HAUSNUMMER(Arzt)---</houseNumber>
                    <postalCode>---PLZ(Arzt)---</postalCode>
                    <city>---STADT(Arzt)---</city>
                </addr>
            </representedCustodianOrganization>
        </assignedCustodian>
    </custodian>
    <informationRecipient typeCode="PRCP">
        <!--- Empfaenger -->
        <intendedRecipient>
            <id extension="9812345" root="2.16.840.1.113883.3.933"/>
            <informationRecipient>
                <name>
                    <prefix>Dr.med.</prefix>
                    <given>Theo</given>
                    <family>Huber</family>
                </name>
            </informationRecipient>
            <receivedOrganization>
                <addr>
                    <streetName>Kölner Landstr.</streetName>
                    <houseNumber>240</houseNumber>
                    <postalCode>52351</postalCode>
                    <city>Düren</city>
                </addr>
            </receivedOrganization>
        </intendedRecipient>
    </informationRecipient>
   
    <participant typeCode="HLD">
        <!--- Versicherungsangaben participant -->
        <associatedEntity classCode="POLHOLD">
            <id extension="---ID BEI VERSICHERUNG(PATIENT)---" root="2.16.840.1.113883.2.6.234.93345"/>
            <code code="SELF" codeSystem="2.16.840.1.113883.5.111"/>
            <associatedPerson>
                <name>
                    <given>---VORNAME(Patient)---</given>
                    <family>---NACHNAME(Patient)---</family>
                </name>
            </associatedPerson>
            <scopingOrganization>
                <id extension="4112047" root="2.16.840.1.113883.2.6.234"/>
                <name>---NAME DER VERSICHERUNG---</name>
                <addr>
                    <streetName>---STRASSENNNAME(Versicherung)---</streetName>
                    <houseNumber>---HAUSNUMMER(Versicherung)---</houseNumber>
                    <postalCode>---PLZ(Versicherung)---</postalCode>
                    <city>---STADT(Versicherung)---</city>
                </addr>
            </scopingOrganization>
        </associatedEntity>
    </participant>
    <relatedDocument typeCode="RPLC">
        <parentDocument>
            <id extension="60248,71746" root="1.2.276.0.58"/>
        </parentDocument>
    </relatedDocument>
    <component>
        <structuredBody>
            <component>
                <!-- Befund Komponente -->
                <section>
                    <code code="10210-3" codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
                    <title>---TITEL DES BEFUNDES DER PATIENTIN---</title>
                    <text>--- BEFUND DER PATIENTIN---</text>
                </section>
            </component>   
        </structuredBody>
    </component>
</ClinicalDocument>
