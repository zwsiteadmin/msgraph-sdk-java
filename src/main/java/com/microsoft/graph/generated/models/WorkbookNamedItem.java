package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookNamedItem extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkbookNamedItem} and sets the default values.
     */
    public WorkbookNamedItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkbookNamedItem}
     */
    @jakarta.annotation.Nonnull
    public static WorkbookNamedItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookNamedItem();
    }
    /**
     * Gets the comment property value. The comment associated with this name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComment() {
        return this.backingStore.get("comment");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("visible", (n) -> { this.setVisible(n.getBooleanValue()); });
        deserializerMap.put("worksheet", (n) -> { this.setWorksheet(n.getObjectValue(WorkbookWorksheet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of the object. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the scope property value. Indicates whether the name is scoped to the workbook or to a specific worksheet. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScope() {
        return this.backingStore.get("scope");
    }
    /**
     * Gets the type property value. The type of reference is associated with the name. Possible values are: String, Integer, Double, Boolean, Range. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.backingStore.get("type");
    }
    /**
     * Gets the value property value. The formula that the name is defined to refer to. For example, =Sheet14!$B$2:$H$12 and =4.75. Read-only.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Gets the visible property value. Indicates whether the object is visible.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getVisible() {
        return this.backingStore.get("visible");
    }
    /**
     * Gets the worksheet property value. Returns the worksheet to which the named item is scoped. Available only if the item is scoped to the worksheet. Read-only.
     * @return a {@link WorkbookWorksheet}
     */
    @jakarta.annotation.Nullable
    public WorkbookWorksheet getWorksheet() {
        return this.backingStore.get("worksheet");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("comment", this.getComment());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("scope", this.getScope());
        writer.writeStringValue("type", this.getType());
        writer.writeObjectValue("value", this.getValue());
        writer.writeBooleanValue("visible", this.getVisible());
        writer.writeObjectValue("worksheet", this.getWorksheet());
    }
    /**
     * Sets the comment property value. The comment associated with this name.
     * @param value Value to set for the comment property.
     */
    public void setComment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("comment", value);
    }
    /**
     * Sets the name property value. The name of the object. Read-only.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the scope property value. Indicates whether the name is scoped to the workbook or to a specific worksheet. Read-only.
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scope", value);
    }
    /**
     * Sets the type property value. The type of reference is associated with the name. Possible values are: String, Integer, Double, Boolean, Range. Read-only.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("type", value);
    }
    /**
     * Sets the value property value. The formula that the name is defined to refer to. For example, =Sheet14!$B$2:$H$12 and =4.75. Read-only.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("value", value);
    }
    /**
     * Sets the visible property value. Indicates whether the object is visible.
     * @param value Value to set for the visible property.
     */
    public void setVisible(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("visible", value);
    }
    /**
     * Sets the worksheet property value. Returns the worksheet to which the named item is scoped. Available only if the item is scoped to the worksheet. Read-only.
     * @param value Value to set for the worksheet property.
     */
    public void setWorksheet(@jakarta.annotation.Nullable final WorkbookWorksheet value) {
        this.backingStore.set("worksheet", value);
    }
}
