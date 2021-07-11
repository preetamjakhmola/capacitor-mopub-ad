# cap-mopub-ad

capacitor plugin for Mopub ad service.

## Install

```bash
npm install cap-mopub-ad
npx cap sync
```

## API

<docgen-index>

* [`initialize(...)`](#initialize)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### initialize(...)

```typescript
initialize(options: CapMopubAdInitializationOptions) => any
```

| Param         | Type                                                                                        |
| ------------- | ------------------------------------------------------------------------------------------- |
| **`options`** | <code><a href="#capmopubadinitializationoptions">CapMopubAdInitializationOptions</a></code> |

**Returns:** <code>any</code>

--------------------


### Interfaces


#### CapMopubAdInitializationOptions

| Prop                               | Type                 | Description                                            | Default            |
| ---------------------------------- | -------------------- | ------------------------------------------------------ | ------------------ |
| **`requestTrackingAuthorization`** | <code>boolean</code> | Use or not requestTrackingAuthorization in iOS(&gt;14) |                    |
| **`testingDevices`**               | <code>{}</code>      |                                                        |                    |
| **`initializeForTesting`**         | <code>boolean</code> |                                                        | <code>false</code> |

</docgen-api>
