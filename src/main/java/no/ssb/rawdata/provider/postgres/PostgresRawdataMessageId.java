package no.ssb.rawdata.provider.postgres;

import java.util.Objects;
import java.util.UUID;

class PostgresRawdataMessageId {
    final String topic;
    final UUID id;
    final String opaqueId;

    PostgresRawdataMessageId(String topic, UUID id, String opaqueId) {
        this.topic = topic;
        this.id = id;
        this.opaqueId = opaqueId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PostgresRawdataMessageId)) return false;
        PostgresRawdataMessageId that = (PostgresRawdataMessageId) o;
        return id == that.id &&
                Objects.equals(topic, that.topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, id);
    }

    @Override
    public String toString() {
        return "PostgresRawdataMessageId{" +
                "topic='" + topic + '\'' +
                ", id=" + id +
                ", opaqueId='" + opaqueId + '\'' +
                '}';
    }
}
